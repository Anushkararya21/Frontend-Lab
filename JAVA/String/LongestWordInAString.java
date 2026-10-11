import java.util.*;
public class LongestWordInAString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String longestword = "";
        for(String a: words){
            if(a.length() > longestword.length()) longestword=a;
        }
        System.out.println(longestword);
    }
}
