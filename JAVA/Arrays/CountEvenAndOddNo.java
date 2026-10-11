package JAVA.Arrays;
import java.util.*;
public class CountEvenAndOddNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,4,5,6};
        int countE = 0;
        int countO = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                countE++;
            }
            else{
                countO++;
            }
        }
        System.out.println("CountE = " + countE );
        System.out.println("CountO = " + countO );
    }
    
}
