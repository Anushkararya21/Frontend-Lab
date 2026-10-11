import java.util.*;
public class TwoStringAreAnagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("valid anagram");
        }
        else{
            System.out.println("invalid anagram");
        }
    }
}
