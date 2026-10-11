import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        String str = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            str=ch+str;
        }
       // for(char ch : s.toCharArray()){
       //     str = ch + str;
        //}
        System.out.println(str);
        sc.close();
    }
}
