public class insertionsort{
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            // finding out the correct pos to insert
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        insertionSort(arr);
        print(arr);
    }
}