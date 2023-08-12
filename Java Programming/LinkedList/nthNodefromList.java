// find the nth node from the end
public class nthNodefromList{
    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static Node getNode(Node head, int n){
        // here we traverse the linkedlist two times
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int m= size-n+1;
        temp=head;
        for(int i=0;i<m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
   public static Node getNode2(Node head, int n){
        // one traversal only
        Node slow =head;
        Node fast= head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String args[]){
        Node a= new Node(5); 
        Node b= new Node(3);
        Node c= new Node(9);
        Node d= new Node(8);
        Node e= new Node(16);
        Node f= new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
       // Node result= getNode2(a,5);
        Node result= getNode2(a,4);
        System.out.println(result.data);

    }
}