import java.util.*;
public class largestnumber{
    public static int largestNumber(int arr[],int n){
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest Value is : "+ smallest);
        return largest;
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
            int result=largestNumber(arr,n);
            System.out.println("Largest Number is: "+ result);
        }

    }
}