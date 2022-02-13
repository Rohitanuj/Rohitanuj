package Rohit;
import java.security.cert.PKIXBuilderParameters;
import java.util.Currency;
import java.util.Scanner;

import javax.sound.sampled.DataLine;

//import java.nio.file.AccessDeniedException;

public class DoubleLinkedList {
    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data){
            this.data=data;
     }

        public void max(DoubleLinkedList dList) {
            var current = DoubleLinkedList.head.next;  
            //Initializing max to initial node data  
            int max = DoubleLinkedList.head.data;  
            if(DoubleLinkedList.head == null) {  
                System.out.println("List is empty");  
            }  
            else {  
                 do{  
                     //If current node's data is greater than max  
                     //Then replace value of max with current node's data  
                     if(max < current.data) {  
                         max = current.data;  
                     }  
                     current= current.next;  
                    }while(current != DoubleLinkedList.head);  
          
                System.out.println("Maximum value node in the list: "+ max);  
            }
        
          //   System.out.println(current.data);
        }
    }
        public void max(DoubleLinkedList dList){
            var current = DoubleLinkedList.head.next;  
            //Initializing max to initial node data  
            int max = DoubleLinkedList.head.data;  
            if(DoubleLinkedList.head == null) {  
                System.out.println("List is empty");  
            }  
            else {  
                 do{  

                     //Then replace value of max with current node's data  
                     if(max < current.data) {  
                         max = current.data;  
                     }  
                     current= current.next;  
                    }while(current != DoubleLinkedList.head);  
          
                System.out.println("Maximum value node in the list: "+ max);  
            }
        
          //   System.out.println(current.data);
        }
    
    
static Node head;
Node tail=null;

public void addNode(int data){
  //  int count=0;

    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
   //     head.previous=null;

//tail.next=null;
    }
    else{
        tail.next=newNode;

        newNode.previous=tail;

        tail=newNode;

        tail.next=null;
    }
   // count=countloop();

}  


public void display(){
    Node current=head;
    if(head==null){
        System.out.println("List is empty");
        return;
    }
    System.out.println("Nodes of Doubly Linked List :");
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
 
        }    
}
public void display2(){
    Node current=tail;
    if(head==null){
        System.out.println("Linked Lisrt Is Empty");

    }
    System.out.println("Reverse Doudly Lisked List is ");
    while(current!=null){
        System.out.print(current.data+"<-");
        current=current.previous;
    }
}
public int loop(){
    Node current=head;
    int count=0;
    while(current!=null){
        count++;
        current=current.next;
    }
   System.out.println(count);
    return count;

}
public void Reverse(){
    Node current=head;
    Node previous=null;
    Node next=null;
    while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
            
    }
   

    return ;
}
public void addnodes(int a,int p){



}
    public static void main(String[] args){
     int n=0;
     int a=0;
        int b=0;
     System.out.println("Enter tHE Numbers to be input:");  
     Scanner input=new Scanner(System.in);
      a=input.nextInt();
 //        System.out.println("Enter THE Numbers to be input:");        

        DoubleLinkedList dList=new DoubleLinkedList();
        
        for(int i=1;i<=a;i++){
            System.out.print(i +"th Index ");
           n=input.nextInt();
      dList.addNode(n);
       //     dList.addNode(4);
        //    dList.addNode(5);
    }
  // dList.addNode(47);
      //    dList.addNode(5);
        
            dList.display();
     //       int data=input.nextInt();
     //      int place=input.nextInt();
      //      dList.addnodes(data,place);
           System.out.println("The No Of Nodes are=>"+ dList.loop());
       dList.Reverse();
       System.out.println("THe Reverse LInked List IS");
       dList.display();
       //   dList.tail.max(dList);
     dList.display2();
      
}
}
