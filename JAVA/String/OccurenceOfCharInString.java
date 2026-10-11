import java.util.*;
public class OccurenceOfCharInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "hello world";
        char target = 'l';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Count: " + count);

    
    }
}
