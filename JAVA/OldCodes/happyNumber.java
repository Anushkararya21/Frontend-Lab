import java.util.Scanner;

public class happyNumber {
	public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	boolean[] visited = new boolean[integer.MAxvalue];
	while(n!=0){
	    if(visited[n]){
	         return false;
	    }
	    visited[n] = true;
	    n = getNext(n);
	}
	return true;

	}
}
