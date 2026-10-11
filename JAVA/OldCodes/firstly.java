public class firstly{
    public static void main (String []arg){
        String str = "Hello Java";
        int len = str.length();
        for (int i =0 ; i<len ;i++){
            char ch = str.charAt(i);
            if ( ch>= 'A' && ch <= 'Z'){
                System.out.println((char)(ch + 32));
            }
            else if ( ch >= 'a' && ch<= 'z'){
                System.out.println((char)(ch-32));
            }
            else 
                System.out.println(ch);
        }
    }
}


 