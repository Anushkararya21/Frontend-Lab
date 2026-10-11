import java.util.*;
public class ReverseStringusingSB {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        sb.reverse();
        System.out.println(sb.toString());
     }
}
