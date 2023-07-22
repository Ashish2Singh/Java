public class firstindex{
    public static int firstindex(int []arr,int target,int index){
        //base case
        if(index==arr.length){
            return -1;
        }
        // self work

        if(arr[index]==target){
            return index;
        }
        return firstindex(arr,target,index+1);
    }
    public static void main(String[] args){
        int[] arr={1,2,4,2,2,6,4,2};
        int target=4;
        int index=0;
        System.out.println(firstindex(arr,target,index));
    }
}