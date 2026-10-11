import java.util.*;
public class CheckTwoStringAreRotationOfEachOther {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length()==s2.length() && (s1+s1).contains(s2)){
            System.out.println("rotation of each other");
        }
        else{
            System.out.println("no");
        }
    
    }
}
