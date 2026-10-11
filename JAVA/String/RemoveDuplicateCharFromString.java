import java.util.*;
public class RemoveDuplicateCharFromString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toLowerCase().toCharArray();
        Arrays.sort(arr);
        String result = "";
        for(int i=0 ; i<arr.length; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                result = result + arr[i];
            }
        }
        System.out.println(result);
    }
}
