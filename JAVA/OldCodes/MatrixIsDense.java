import java.util.*;
public class MatrixIsDense {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();

        }
        int countZ=0;
        int countO=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countZ++;
            }
            else{
                countO++;
            }
        }
        if(countZ>countO){
            System.out.println("Not dense");
        }
        else{
            System.out.println("Dense");
        }

    }  
}
