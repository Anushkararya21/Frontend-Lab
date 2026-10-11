import java.util.*;
public class lengthOfStringWthFunct {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    int count = 0 ;
    for(int i=0;i<c.length;i++){
         count++;
    }
    
   System.out.println(count);

   } 
}
