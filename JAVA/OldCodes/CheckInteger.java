import java.util.Scanner;
public class CheckInteger {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
      

        if(sc.hasNextInt()){
            int num = sc.nextInt();
            System.out.println(num + " is an integer number");
        }
        else{
            System.out.println("Entered value is not an integer");
        }
        sc.close();

    }
    
}
