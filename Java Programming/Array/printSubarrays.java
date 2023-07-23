import java.util.*;
public class printSubarrays{
    public static void printsubarrays(int arr[],int n){
        int total_subarray=0;
       for(int i=0;i<n;i++){ // start yha se milega
        int start=i;
        for(int j=i;j<n;j++){ // end yha se milega...i+1 isliye nhi hua kyuki single element bhi subarray hota hai
            int end=j;
            for(int k=start;k<=end;k++){ // its only to print the subarray.. start end pta chal gya ab dono ke beech jitne subarray aayenge print krwa denge
                System.out.print(arr[k]+" "); //subarray
            }
            total_subarray++;
           System.out.println();
        }
         System.out.println();
       }
       System.out.println("Total subarrays: "+ total_subarray);
    }
     public static void main(String args[]){
         try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
      int n=s.nextInt();
            int arr[]=new int[50];
            System.out.println("Enter the array elements: ");
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            printsubarrays(arr,n);
        }
     }
}
