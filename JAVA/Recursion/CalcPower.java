import java.util.*;
public class CalcPower {
    static int helper(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1 = helper(x, n-1);
        int xPown = x*xPownm1;
        return xPown;
    }

        //x^n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(helper(x,n));
    }
}
