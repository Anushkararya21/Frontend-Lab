import java.util.*;

public class CheckSortedArray {
    public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
	for(int i=0;i<6;i++){
	    arr[i]=sc.nextInt();
	}
	for(int i=0; i<arr.length-1;i++){
		if(arr[i]>arr[i+1]){
			System.out.print("not sorted");
			return;
		}
	}
	System.out.print("sorted");
    }
}