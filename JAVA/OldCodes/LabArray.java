import java.util.*;
    public class LabArray{
	public static void main(String[] args){
	    int[] arr = {1,2,3,50,49,68,13};
	   // Arrays.sort(arr);
	   // System.out.println(arr[arr.length-2]);	

	   int fmax = arr[0];
	   int smax = -1;
	   for(int i=0; i<arr.length;i++){
	        if(fmax<arr[i]){
		     smax = fmax;
		     fmax = arr[i];
		}
		else if(smax<arr[i] && fmax>arr[i]){
			smax = arr[i];
		}
	   }
	   System.out.println(fmax+" "+smax);

	}
    }