import java.util.Scanner;

public class numberthatisrepeatedfirst {
    public static int firstRepeatingNumber(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
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
            System.out.println(firstRepeatingNumber(arr, n));
        }
    }
}
