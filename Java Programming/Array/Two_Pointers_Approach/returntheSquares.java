
import java.util.*;
public class returntheSquares{
    public static int[] sortSquares(int arr[]){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int[] ans= new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left])> Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
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
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n=sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter the array elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
           int ans[]= sortSquares(arr);
           reverse(ans, n);
            printArray(ans);
   }
}
