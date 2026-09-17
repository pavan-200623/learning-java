import java.util.*;

public class main{
    public static void main(String[] args){
        LinkedList l=new LinkedList();
        l.inserted(10);
        l.inserted(20);
        l.display();
    }
static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class LinkedList{
        Node head;

        void inserted(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }

            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }

            temp.next=newnode;
        }

        int countNodes(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    
}