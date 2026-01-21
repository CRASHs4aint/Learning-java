package LinkList;

public class NodeOfLinkedlist
{
   public static void main(String[] args) {
//10 20 30 40
       Node a =new Node(); a.val=10; //LinkList.Node@3fa77460
       Node b =new Node(); b.val=20;
       Node c =new Node(); c.val=30;
       Node d =new Node(); d.val=40;
       Node e =new Node(); e.val=50;

       //node ko connect karenge (link kargenge)
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       System.out.println(a);
       System.out.println(a.next.next.next.val); //40
    }
}
