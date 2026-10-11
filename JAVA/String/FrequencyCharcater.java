import java.util.Scanner;
public class FrequencyCharcater{
	public static void main(String[] args) {
		String str =  "helloji";
		boolean[] a = new boolean[str.length()];
		for(int i=0;i<str.length();i++){
			if(a[i])
				continue;
			int count = 1;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
					a[j] = true;
				}
			}
			System.out.println(str.charAt(i) + ": " + count);
		}
	}
}