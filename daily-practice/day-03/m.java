import java.util.*;

public class m {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);
        list.display();
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        void insertFront(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
