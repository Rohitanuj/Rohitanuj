package Rohit;

import java.util.Scanner;

public class TestLinkedList {

    static class Node{
        Node Next;
        Node Previous;
        int data;

        public Node(int data){
            this.data=data;

        }

    }

    static Node head=null;
    static Node tail=null;
    public void addNode(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        else
        {
            tail.Next=newNode;
            newNode.Previous=tail;
            tail=newNode;
        }
    }

    public void Display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of Doubly Linked List :");
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.Next;

        }
    }

    public static void main(String[] args){
        int l1,l2;
        Scanner input=new Scanner(System.in);

        TestLinkedList firstList= new TestLinkedList();
        TestLinkedList secondList=new TestLinkedList();


        System.out.println("Enter the number of Elements in Linked List first-:");
        l1=input.nextInt();

        for(int i=1;i<=l1;i++){
            int n=input.nextInt();
            firstList.addNode(n);
        }
        firstList.Display();

        System.out.println("\nEnter the number of Elements in Linked Second-:");
        l2=input.nextInt();

        for(int i=1;i<=l2;i++){
            int n1=input.nextInt();
            secondList.addNode(n1);
        }
        secondList.Display();
    }
}
