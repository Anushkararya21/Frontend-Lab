package JAVA.Arrays;
import java.util.*;
public class SumOfArrayElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    
}
