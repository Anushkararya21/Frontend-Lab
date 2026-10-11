import java.util.Scanner;
public class ReverseStringUsingCharArr{
	public static void main(String[] args) {
		String str =  "Anushkar";
		char[] arr = str.toCharArray();
		int i = 0;
		int j = arr.length-1;
		while(i<j){		
			char c = arr[i];
			arr[i] = arr[j];
			arr[j] = c;
			i++;
			j--;
		}
		str = new String(arr);
		System.out.print(str);
	}
}