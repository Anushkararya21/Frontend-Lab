package JAVA.Arrays;
import java.util.*;
public class MinimumElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {20,50,30,10,5};
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    
}
