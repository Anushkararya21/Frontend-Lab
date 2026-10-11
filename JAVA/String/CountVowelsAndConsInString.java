import java.util.*;
public class CountVowelsAndConsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int vc = 0;
        int cc = 0;
        for(char c:s.toCharArray()){
            if(c>='A' && c<='z'){
                if("aeiouAEIOU".indexOf(c)>=0){
                    vc++;
                }
                else{
                    cc++;
                }
            }
        }
        System.out.println(vc);
        System.out.println(cc);
    }
    
}
