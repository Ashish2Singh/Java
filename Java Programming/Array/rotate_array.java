import java.util.Scanner;

public class rotate_array{
    public static int[] rotate(int arr[],int n,int k){
        k=k%n;
        int [] ans=new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
       try (Scanner s = new Scanner(System.in)) {
        System.out.print("Enter the number of elements in the array: ");
           int n=s.nextInt();
           int arr[]=new int[n];
            System.out.println("Enter the array elements: ");
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            int k=4;
            int[] ans= rotate(arr, n, k);
            printArray(ans);
    }
    }
}