import java.util.Scanner;

public class TwoSum1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();        // array size
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();  // array elements input
        }

        int target = sc.nextInt();   // target input

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                    return;   // pair milte hi program stop
                }
            }
        }

        System.out.println("No pair found");
    }
}
