public class returntheindex{
    public static int indexreturn(int []arr,int target,int index){
        //base case
        if(index==arr.length){
            return -1;
        }
        // self work

        if(arr[index]==target){
            return index;
        }
        return indexreturn(arr,target,index+1);
    }
    public static void main(String[] args){
        int[] arr={1,2,4,6};
        int target=6;
        int index=0;
        System.out.println(indexreturn(arr,target,index));
    }
}