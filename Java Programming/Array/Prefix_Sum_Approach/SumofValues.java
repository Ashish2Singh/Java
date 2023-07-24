//Given an array of integers of size n. Answer q queries where you need to print the sum
// of values in a given range of indices from l to r(both included).
//Note: the value of l and r in queries follow 1-based indexing
import java.util.*;
public class SumofValues{
    public static int[] prefix(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
         }
         return arr;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
}
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array: ");
            int n=sc.nextInt();
            int arr[]= new int[n+1];
            System.out.println("Enter the array elements");
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
            }
            int[] ans=prefix(arr);
            System.out.println("Enter the number of queries: ");
            int q=sc.nextInt();
            while(q-->0){
                System.out.println("Enter the range: ");
                int l=sc.nextInt();
                int r=sc.nextInt();
                int result= ans[r]-ans[l-1];
                System.out.println("The sum is "+ result);
                
            }
        

    }
    }

