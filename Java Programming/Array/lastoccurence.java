import java.util.Scanner;

public class lastoccurence {
    public static int LastOccurence(int arr[],int n,int k){
        int p=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                p=i;
            }
        }
        return p;
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
            int index=LastOccurence(arr,n,k);
            if(index==-1){
                System.out.println("There is no element in the array");
            }
            else{

            
            System.out.println("The last occurence of the element is "+index);
   }
        }
}
}
