import java.util.*;
public class counttheoccurence {
    public static int occurence(int arr[],int n,int k){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                count++;
            } 
        }
        return count;
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
            System.out.println("Enter the element: ");
            int k= sc.nextInt();
            System.out.println("The number of occurence of the element is "+occurence(arr,n,k));
        }
    }
}
