package Rohit.StackByAnuj;

import java.util.Scanner;

import javax.naming.NotContextException;

class Node{
    int data ;
     Node next;
     }
 class StackByNodes {
    private Node top;
    private int NodesCount;
    public StackByNodes(){
        this.top=null;
        this.NodesCount=0;

    }
         public void push(){
             Scanner input=new Scanner(System.in);

             int data=input.nextInt();
             System.out.println("incerting "+data);

            Node node=new Node();
            if(node==null){
                System.out.println("Heap Overflow");
                return;
            }
           // System.out.println("incerting "+data);
        node.data=data;
        
        node.next=top;
        top=node;
        this.NodesCount+=1;

        }
        public int peek(){
            if(isEmpty()){
                System.out.println("The Stack is Empty");
                System.exit(-1);
            }
            return top.data;

        }
        public boolean isEmpty(){
            return top==null;
        }
        public  int pop(){
            if(isEmpty()){
                System.out.println("Stack Underflow");
                System.exit(-1);
            }
            int top=peek();
            System.out.println("Removing "+top);
            this.NodesCount-=1;
            this.top=(this.top).next;
            return top;
        }
        public int size(){
            return this.NodesCount;

        }
 
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            StackByNodes Anuj=new StackByNodes();
            for(int i=0;i<n;i++){  
                int a=input.nextInt();
                          Anuj.push();
            }

            
            System.out.println("The top element is "+Anuj.peek());
            
            Anuj.pop();
            Anuj.pop();

            System.out.println("The top element is "+Anuj.peek());

            if(Anuj.isEmpty()){
                System.out.println("The Stack Is Empty");
            }
            else
            System.out.println("The Stack is Not Empty");
        }
    }
    
    

