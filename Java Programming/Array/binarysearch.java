import java.util.*;
public class binarysearch{
    public static int binarySearch(int arr[],int key,int n){
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

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
            int key;
            System.out.println("Enter the key:");
            key=s.nextInt();
            int index=binarySearch(arr,key,n);

            if(index==-1){
                System.out.println("element not found!");
            }
            else{
                 System.out.println("The index of the element is: "+ index);
            }
        }
    }
}