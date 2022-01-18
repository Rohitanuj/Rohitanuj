package Rohit;
import java.util.*;
public class DeleteMid {
    class Node{
            int data;
            Node next;
            Node previous;

            public Node(int data){
                this.data=data;
            }
        }
        public int size = 0;  

    private static final String rList = null;
        static Node head;
        Node tail=null;
      
   
        
         public void addNode(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                head.previous=null;

                tail.next=null;
            }
            else {
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
                tail.next=null;
            }
        size++;
         }
         public void deletemid(){
            if(head==null){
                return;
            }
            else {
              Node  current=head;
                int mid=(size%2==0)?(size/2):((size+1)/2);

                for(int i=1;i<mid;i++){
                    current=current.next;
                }
                if(current==head){
                    head=current.next;
                }
            else if(current==tail){
                tail=tail.previous;
            }
            else {
                current.previous.next=current.next;
                current.next.previous=current.previous;
            }
            current=null;
            }
            size--;
                }
            
         public void display(){
    Node current=head;
    if(current==null){
            System.out.println("List IS EMPTY ");
                    }
            else    {
                while(current!=null)
                        {
                           System.out.print(current.data+"-->");
                            current=current.next;
                        }

                }
                return;
        }
            
    public static void main(String[] args){
        DeleteMid rList=new DeleteMid();
        int a=0,n=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter");
         a=input.nextInt();
      for(int i=1;i<a;i++){
        System.out.print("Node Index"+i);
        n=input.nextInt();
  //      System.out.print("Node Index"+i);
       rList.addNode(n);
      }

      rList.display();
      while(rList.head!=null){
        rList.deletemid();
        System.out.println("New Nodes");
        rList.display();
      }
      
    }       
    
}
