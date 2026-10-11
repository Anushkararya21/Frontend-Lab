//import java.util.*;
package JAVA.Arrays;
import java.util.*;

public class MaximumElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        int max = arr[0];
        for(int i=1; i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    
}
