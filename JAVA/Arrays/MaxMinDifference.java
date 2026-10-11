import java.util.*;

public class MaxMinDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = {10, 5, 20, 8, 25};

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int difference = max - min;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Difference: " + difference);
    }
}