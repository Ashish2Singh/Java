public class ArrayImplementation {
    public static class Stack{
        int[] arr=new int[10];
        int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int peek(){
            if(idx==0) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else{
                return false;
            }
        }
        boolean isFull(){
            if(idx==arr.length){
                return true;
            }
            else{
                return false;
            }
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(1);
        st.display();
        System.out.println("size is: "+ st.size());
        st.pop();
        st.display();
        System.out.println("size is: "+ st.size());
    }
}
