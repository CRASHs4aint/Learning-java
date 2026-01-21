package LinkList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class Displaylist {
   public static void dispaly(Node head) {
       Node temp =head;
       while(temp!=null){
           System.out.print(temp.val+" ");
           temp =temp.next;
       }

    }
    public static void main(String[] args) {
        Node a =new Node(10);  //LinkList.Node@3fa77460
        Node b =new Node(20);
        Node c =new Node(40 );
        Node d =new Node(60);
        Node e =new Node(70);

        //node ko connect karenge (link kargenge)
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
    }
}
