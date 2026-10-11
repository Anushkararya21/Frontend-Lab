
import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args){

        int[] arr = {10, 30, 40, 40, 20, 35};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > first) {
                second = first;
                first = arr[i];
            } 
            else if(arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        if(second == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + second);
        }
    }
}