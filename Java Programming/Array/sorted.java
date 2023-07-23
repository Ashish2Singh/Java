import java.util.Scanner;

public class sorted {
    public static boolean Sorted(int arr[],int n){
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int n=sc.nextInt();
            int [] arr= new int[n];
            System.out.println("Enter the array elements: ");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(Sorted(arr,n)){
                System.out.println("The array is sorted!");
            }
            else{
                System.out.println("The array is not sorted");
            }
        }
        
    }
}
