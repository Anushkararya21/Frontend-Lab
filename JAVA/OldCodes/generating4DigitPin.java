import java.util.Scanner;

public class generating4DigitPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int pin = (int)(Math.random() * 10000);
	String pinStr = String.format("%04d", pin);
	System.out.println("Generated PIN: " + pinStr);
    }
}
