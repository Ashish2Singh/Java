public class implementLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        //insert at end
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;  
            }
            else{
            tail.next=temp;
        }
        tail=temp;
    }
     int size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    // insert at beginning
    void insertAtBegin(int val){
        Node temp=new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }
    // insert at any given index
    void insertAtIndex(int val,int index){
        Node p= new Node(val);
        Node temp=head;
        if(index==size()){
            insertAtEnd(val);
            return;
        }
        else if(index==0){
            insertAtBegin(val);
            return;
        }
        else if(index<0 || index>size()){
            System.out.println("Wrong Index");
            return;
        }
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        p.next=temp.next;
        temp.next=p;

    }
    // delete at any index
    void deleteAtIndex(int index){
        if(index==0){
            head=head.next;
            return;
        }
        Node temp=head;
        for(int i=1;i<=index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(7);
        ll.insertAtEnd(9);
        ll.insertAtBegin(5);
        ll.insertAtBegin(3);
        ll.display();
        System.out.println();
        ll.insertAtIndex(8, 2);
        ll.display();
    }
}
