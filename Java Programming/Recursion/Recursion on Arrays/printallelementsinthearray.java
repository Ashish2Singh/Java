public class printallelementsinthearray{
    public static void printArray(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        printArray(arr,index+1);
    }
    public static void main(String args[]){
        int [] arr={5,6,7,8,2};
        int index=0;
        printArray(arr,index);
    }
}