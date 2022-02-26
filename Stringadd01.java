package Rohit.StackByAnuj;
import java.util.*;
public class StackArray {
    public static void main(String args[]){
        Stack stk=new Stack<>();        
        System.out.println("Stack"+stk);
        pushinStack(stk,20);
        pushinStack(stk,24);
        popinStack(stk);

        try{
            popinStack(stk);

        }
        catch(EmptyStackException e){
            System.out.println("Stack is Empty");
        }
    }
    static void pushinStack(Stack stk,int x){
        stk.push(new Integer(x));
        System.out.println("push:"+x);
        System.out.println("Stack:"+stk);
    }
        static void popinStack(Stack stk){
            System.out.println("POP->");
            Integer x=(Integer) stk.pop();
            System.out.println(x);
            System.out.println("Stack :"+stk);
        }
}
