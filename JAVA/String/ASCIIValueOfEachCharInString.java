import java.util.*;
public class ASCIIValueOfEachCharInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        /* 
        for(char ch: str.toCharArray()){
            System.out.println((int)ch);
            */
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            System.out.println(ascii);
        
        }
    }
}
