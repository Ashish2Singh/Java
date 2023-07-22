import java.util.*;
public class reverseArray{
    public static void reverse(int arr[],int n){
        int low=0,high=n-1;
        while(low<high){
            //swap
            int temp=arr[high];
            arr[high]=arr[low];
            arr[low]=temp;
            low++;
            high--;
        }
    }
    
     public static void main(String args[]){
         Scanner s= new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
       int n=s.nextInt();
        int arr[]=new int[50];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        reverse(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
     }
}