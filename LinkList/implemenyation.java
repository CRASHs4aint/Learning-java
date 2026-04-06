package LinkList;

import stack.linkListImplementaion;

public class implemenyation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size=0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;

        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }
//
//        int size() {
//            Node temp = head;
//            int count = 0;
//            while (temp != null) {
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) { //empty list
                head = tail = temp;
            } else { // non empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx < 0 || idx > 0) {
                System.out.println("wrong index");
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx){
            if (idx < 0 || idx > 0) {
                System.out.println("wrong index");
                return -1;
            }
            Node temp=head;
            for(int i=0;i<idx;i++){
               temp=temp.next;
            }
            return temp.data;
        }
    }

    static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();
        System.out.println(ll.size);
        ll.insertAtEnd(4);
        ll.display();
        ll.insertAtHead(9);
        ll.display();
        ll.insertAt(2, 10);
        ll.display();
        ll.insertAt(0, 100);
        ll.display();
        System.out.println(ll.getAt(3));

    }
}
