import java.util.Scanner;

public class PalindromePossible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] freq = new int[256];  

        // count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;
        }

        int oddCount = 0;

        // count odd frequencies
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }

       
        if (oddCount <= 1) {
            System.out.println("Palindrome possible");
        } else {
            System.out.println("Palindrome NOT possible");
        }
    }
}
