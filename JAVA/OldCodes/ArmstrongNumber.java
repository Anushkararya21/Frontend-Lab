import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

	int original=n;

	int sum=0;
	int digit1=0;
	while(n>0){
	    int digit=n%10;
	    digit1=(int)Math.pow(digit,3);
	    sum=sum+digit1;
	    n=n/10;
	}
	if(sum==original){
	     System.out.println("Armstrong No");
	}
	else{
	     System.out.println("Not an Armstrong No");
	}
    }
}	    
//153 = 1^3 + 5^3 + 3^3 =1 + 125 + 27 ==> 153
