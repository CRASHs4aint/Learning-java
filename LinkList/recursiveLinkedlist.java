//package LinkList;
//
//import java.util.Scanner;
//
//class Node{
//    int  val;
//    int next;
//    Node(int val){
//        this.val=val;
//    }
//}
//
//public class recursiveLinkedlist {
//    public static void displayRec(Node head){
//        if(head== null) return;
//        System.out.print(head.val+"");
//        displayRec(head.next);
//
//    }
//    public static void dispaly(Node head){
//        Node temp =head;
//        while(temp!=null){
//            System.out.print(temp.val+" ");
//            temp =temp.next;
//        }
//    }
//
//  public  static void main(String[] args) {
//        Scanner sc=new Scanner((System.in);
//        Node a= new Node((sc.nextInt());//head node
//        Node b =new Node(20);
//        Node c =new Node(40 );
//        Node d =new Node(60);
//        Node e =new Node(70);
//
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//        dispaly(a);
//        displayRec(a);
//    }
//}
