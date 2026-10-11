import java.util.Scanner;

public class DetectiveClue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        String secondName = sc.next();
        String pinCode = sc.next();
        char ch = sc.next().charAt(0);

        String combined = firstName + secondName + pinCode;
        StringBuilder clue = new StringBuilder();
        
        int a = firstName.length();
        int b = secondName.length();
        int i=0;
        int j=0;
        String s="";
        while(a>0 && b>0){
            s+=firstName.charAt(i++);
            a--;
            s+=secondName.charAt(j++);
            b--;
        }
        while(a>0){
            s+=firstName.charAt(i++);
            a--;
        }
        while(b>0){
            s+=secondName.charAt(j++);
            b--;
        }
        for(int k=0;k<pinCode.length();k++){
            char c = pinCode.charAt(k);
            if(c==ch){
                s += '-';
            }
            else{
                s+=c;
            }
        }
        System.out.println(s);


       
    }
}