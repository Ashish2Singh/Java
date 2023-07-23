import java.util.Scanner;

public class rotatewithoutextraspace {
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }  
    }
    public static void rotate(int arr[],int n,int k){
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);   
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
            int k=2;
            rotate(arr, n, k);
            printArray(arr);
        }

    }
}
