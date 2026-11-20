import java.util.*;
public class FibonacciSeries {
    
    static int helper(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return helper(n-1)+helper(n-2);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(helper(i)+" ");
        }
       
    }
}
