import java.util.Scanner;
public class PalindromeString1{
	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--){
		    rev += str.charAt(i);
		    
		}
		if(rev.equals(str)){
		    System.out.print("Palindrome");
		}
		else{
		    System.out.print("Not Palindrome");
		}
	}
}