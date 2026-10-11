import java.util.Scanner;

public class RoyalPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        String secondName = sc.next();
        String pinCode = sc.next();
        int shift = sc.nextInt();

        String combined = firstName + secondName + pinCode;
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < combined.length(); i++) {
            char c = combined.charAt(i);

            if (c >= 'a' && c <= 'z') {
                char shifted = (char) ((c - 'a' + shift) % 26 + 'a');
                password.append(shifted);
            } 
            else if (c >= 'A' && c <= 'Z') {
                char shifted = (char) ((c - 'A' + shift) % 26 + 'A');
                password.append(shifted);
            } 
            else {
                password.append(c);
            }
        }

        System.out.println(password.toString());
        sc.close();
    }
}