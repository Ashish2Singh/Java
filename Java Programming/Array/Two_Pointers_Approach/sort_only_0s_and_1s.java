import java.util.*;

public class sort_only_0s_and_1s {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void sortZeroesandOnes(int arr[]){
        // 1st approach
        /*for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }*/

        // 2nd approach
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=0 && arr[j]!=1){
                swap(arr,i,j);
                 i++;
                 j--;
            }
           
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }

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
            sortZeroesandOnes(arr);
            printArray(arr);
        }

    
    }
}
