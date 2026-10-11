import java.util.Arrays;
import java.util.Scanner;
public class SlidingWindowFixedSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int sum = 0;
        int left = 0;
        int k = 3;
        int n = arr.length;

        for (int i=0;i<k;i++){
            sum += arr[i];
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            sum = sum - arr[left++];
            sum = sum + arr[i];
            max = Math.max(max, sum);
        }
            System.out.print(max + " ");
        
    }
}
