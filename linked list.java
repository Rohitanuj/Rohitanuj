import java.util.*;
import java.util.Scanner;
 class linked {
private static Integer remove;
private static boolean add;

public static void main(String args[]) {
    ll list=new ll();
    LinkedList<Integer> LL=new LinkedList<>();
    int n=0,c=0,b=2;
      Scanner input= new Scanner(System.in);//Value canning in java 

        System.out.println("Enter the numbers of Nodes =");
    int a=input.nextInt();//no. of nodes 
        System.out.println("Enter Head=");
    c=input.nextInt();
        LL.addFirst(c);
            for(int i=0;i<(a-2);i++){//input values of each nodes 
                System.out.println("Node Values"+b);
                b++;
 
  n =input.nextInt();
    LL.add(n);
  
  }
    System.out.println("Enter Tail");
      int t=input.nextInt(); 
      LL.addLast(t);
  System.out.println(LL);

  /* LinkedList<Integer> ll=new LinkedList<>();// linked list making 
    //adding elements 
        ll.add(10);
add = ll.add(90);
ll.addLast(11);
ll.addFirst(12);
ll.add(2,15);
System.out.println(ll);
ll.remove(11);
remove = ll.remove(90);
ll.remove(12);
System.out.println(ll);*/
}    
}
