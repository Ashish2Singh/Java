import java.util.*;
public class linearsearch{
    public static int linearSearch(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
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
            int index=linearSearch(arr,n,key);

            if(index==-1){
                System.out.println("element not found!");
            }
            else{
                 System.out.println("The index of the element is: "+ index);
            }
        }

   }
}