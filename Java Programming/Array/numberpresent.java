import java.util.Scanner;
// Hint: value of all the elements in the array is less than 10 to the power 5
// An array is given and we can ask q number of queries and we have to check for q times, the element is present or not
// See video : array problem soving -4 of physics wallah java course if any doubt 
public class numberpresent {
    static int[] makeFrequencyArray(int[] arr){
        int [] freq= new int[100005]; // initialising the size of frquency and all the indsex with value 0
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++; // increasing the value of index by value 1.
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            System.out.println("Enter the number of elements in the array: ");
            int n=sc.nextInt();
            int arr[]= new int[n];
            System.out.println("Enter the array elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        int q=5;
        int[] freq= makeFrequencyArray(arr);
        while(q>0){
            System.out.println("Enter the number to search:");
            int x=sc.nextInt();
            if(freq[x]>0){ // checking the index value is greater than 0 or not
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
    }    
}
