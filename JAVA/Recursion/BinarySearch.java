import java.util.*;
public class BinarySearch {
    static int helper(int[] arr,int l,int r,int target){
        if(l>r){
            return -1;
        }
        int mid = l + (r-l)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return helper(arr,l,mid-1,target);
        }
        else{
            return helper(arr,mid+1,r,target);
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            System.out.println(helper(arr,0,n-1,target));
        }
    
}
