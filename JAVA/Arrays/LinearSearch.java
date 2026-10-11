package JAVA.Arrays;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(n);
        }
        int target =sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                System.out.println("found");
                return;
            }
            
        }
        System.out.println("Not found");
    }
    
}
