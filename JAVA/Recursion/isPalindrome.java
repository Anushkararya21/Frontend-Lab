import java.util.*;
public class isPalindrome {

    static boolean helper(String s,int left,int right){
        if(left>=right){
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        return helper(s,left+1,right-1);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(helper(s,0,s.length()-1));
	}
}

