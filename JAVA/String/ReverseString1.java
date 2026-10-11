import java.util.*;
public class ReverseString1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr= s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
        s = new String(arr);
        System.out.println(s);
    }
    
}
