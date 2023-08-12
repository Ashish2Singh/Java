package Prefix_Sum_Approach;
// Given an integer array 'a', return the prefix sum/running sum in the same array without creating a new array
import java.util.*;
public class returnThePrefixSum {
    static int[] prefixSum(int arr[]){
        int n= arr.length;
        // int[] pref= new int[n]; // here we are creating an new array but in the question it's not given
        // pref[0]=arr[0];
        // for(int i=1;i<n;i++){
        //     pref[i]=pref[i-1]+arr[i];
        // }
        // return pref;
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
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int n=sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter the array elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] ans=prefixSum(arr);
            printArray(ans);
        }

    }
}
