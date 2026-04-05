package LinkList;

public class Basics {
    public static void display(Node head){
        while(head!=null){
            System.out.println(head.data + " ");
            head=head.next;
        }
    }
    public static class Node{
        int data ;//value
        Node next; //address of next node
        Node(int data){
            this.data=data;
        }

    }
    static void main(String[] args) {
        Node a = new Node(5);//head node
        Node b = new Node(5);
        Node c = new Node(5);
        Node d = new Node(5);
        Node e = new Node(5);



        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        System.out.println();


    }
}
