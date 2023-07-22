public class maxvalue{
    public static int largest(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int smallAns= largest(arr,index+1);
        return Math.max(arr[index],smallAns);
        }
    
    public static void main(String args[]){
        int [] arr={3,10,3,2,5};
        int index=0;
        System.out.println(largest(arr,index));

    }
}