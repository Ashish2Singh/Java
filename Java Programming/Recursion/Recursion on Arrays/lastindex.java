public class lastindex{
    public static int lastindex(int []arr,int target,int index){
        //base case
        if(index<0){
            return -1;
        }
        // self work

        if(arr[index]==target){
            return index;
        }
        return lastindex(arr,target,index-1);
    }
    public static void main(String[] args){
        int[] arr={1,2,4,2,2,6,4,2};
        int target=2;
        int index=arr.length-1;
        System.out.println(lastindex(arr,target,index));
           
    }
}