import java.util.*;
public class numberOfPairs_SumEqualsTogivenValue {
    public static int countthepairs(int arr[],int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the array: ");
            int n=sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter the array elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the number :");
            int k= sc.nextInt();
            System.out.println("The total number of pairs equal to "+ k + " is "+ countthepairs(arr,k));
        }
    }
}
