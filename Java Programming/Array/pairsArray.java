import java.util.*;
public class pairsArray{
    public static void printPairs(int arr[],int n){
        for(int i=0;i<n;i++){
            int current=arr[i];
            for(int j=i+1;j<n;j++){
                System.out.print("(" + current + "," + arr[j] + ")");
            }
            System.out.println();
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
        printPairs(arr,n);
     }
}