public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Stack{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty!");
                return -1;
            }
            int x=head.data;
            head=head.next;
            size--;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.data;
        }
        void displayLL(Node head){
            if(head==null) return;
            displayLL(head.next);
            System.out.print(head.data+" ");
        }
        void display(){
            displayLL(head);
            System.out.println();
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
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
