import java.util.Scanner;
public class SumOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("the sum of three numbers is:");
        System.out.println(sum);
        sc.close();
    }
}
