public class TakeNegElementsFromTriplet {
   
    public static int isNeg(int[] ar,int s,int e){
        while(s<=e){
            if(ar[s]<0) return ar[s];
            s++;
        }
        return 0;
   }
   
    public static void main(String[] args){
       // Scanner sc = new Scanner(System.in);
        int[] arr = {12,-1,-7,8,-15,30,16,28};
       // int  i = 0;
       // int j = 0;
        int k = 3;
       //  j=k-1;
        /*for(;j<arr.length;j++,i++){
            int x = isNeg(arr,i,j);
            System.out.println(x + " ");
        }*/
       for(int s=0;s<arr.length;s++){
            int e=0;
            while(e<k){
                System.out.println(s+e);
                 e++;
            }
            System.out.println();
       }


    
    }
}
