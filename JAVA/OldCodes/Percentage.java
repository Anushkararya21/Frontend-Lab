import java.util.Scanner;
public class Percentage{

	public static void main(String[] args){
	System.out.println("Taking input from user");
	Scanner sc = new Scanner(System.in); 
	System.out.println("Enter Subject1 Number");
	int a = sc.nextInt();
	System.out.println("Enter Subject2 Number");
	int b = sc.nextInt();
	System.out.println("Enter Subject3 Number");
	int c = sc.nextInt();
	System.out.println("Enter Subject4 Number");
	int d = sc.nextInt();
	System.out.println("Enter Subject5 Number");
	int e = sc.nextInt();
	float avg = (a+b+c+d+e)/5.0f;
    
	System.out.println("The avg of student is : "+avg);
    sc.close();
	

	}
}