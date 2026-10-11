import java.util.*;

public class FrequencyOfELementInArray {
    public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	int[] arr = {1,2,3,2,4,5,6};
	int target = sc.nextInt();
	int count = 0;
	for(int i=0;i<arr.length;i++){
		if(target==arr[i]){
		     count++;
		}
	}
	System.out.print(count);
   }
}

