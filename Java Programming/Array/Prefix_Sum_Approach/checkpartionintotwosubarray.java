//check if we can partition the array into two subarrays with equal sum. More formally,check that the prefix sum of a part of the array 
// is equal to the suffix sum of the rest of the array

import java.util.*;
public class checkpartionintotwosubarray {
    static int findArraySum(int arr[]){
         int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
    public static boolean equalSumPartition(int arr[]){
       int totalSum=findArraySum(arr);
       int prefSum=0;
       for(int i=0;i<arr.length;i++){
        prefSum+=arr[i];
        int suffixSum=totalSum-prefSum;
        if(suffixSum==prefSum){
            return true;
        }
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements in the array: ");
            int n=sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter the array elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(equalSumPartition(arr));
            
        

    }
    
}
