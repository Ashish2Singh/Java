import java.util.Scanner;

public class second_largest {
    public static int largest(int arr[],int n){
        int max_value=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max_value){
                max_value=arr[i];
            }
        }
        return max_value;
    }
    public static int secondlargest(int arr[],int n){
        int mx=largest(arr, n);
        for(int i=0;i<n;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondlargest=largest(arr, n);
        return secondlargest;
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
            System.out.println(secondlargest(arr, n));
        }
    }
}
