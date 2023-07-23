import java.util.*;

// 2nd Method by using prefix array



public class MaxSubarrayPrefix{
    public static void maxsubarrayprefix(int arr[],int n){
        
        int max_sum=Integer.MIN_VALUE;
        int currentSum=0;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
       for(int i=0;i<n;i++){ // start yha se milega
       // start=i ... hmlog aise bhi likh skte hai... start ke liye
        for(int j=i;j<n;j++){ // end yha se milega...i+1 isliye nhi hua kyuki single element bhi subarray hota hai
            currentSum= i==0? prefix[j]:prefix[j]-prefix[i-1];
            // for(int k=i;k<=j;k++){ // its only to print the subarray.. start end pta chal gya ab dono ke beech jitne subarray aayenge print krwa denge
            //     currentSum+=arr[k]; //subarray sum
            // }
            if(max_sum<currentSum){
                max_sum=currentSum;
            }

            System.out.println(currentSum);
           System.out.println();
        }
       }
       System.out.println("Total subarrays: "+ max_sum);
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
            maxsubarrayprefix(arr,n);
        }
     }
}
