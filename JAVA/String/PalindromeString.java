import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        int i=0;
        int j=arr.length-1;
        boolean f = true;
        while(i<j){
            if(arr[i]!=arr[j]){
                f = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(f);
    }
    
}
