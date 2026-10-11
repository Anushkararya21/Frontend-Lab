import java.util.*;
public class VowelAndConsonant1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int vc = 0;
        int cc = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vc++;
            }
            else{
                cc++;
            }
        }
        System.out.println(vc);
        System.out.println(cc);
    }

}
