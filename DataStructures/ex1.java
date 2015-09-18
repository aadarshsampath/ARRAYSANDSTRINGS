/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.Arrays;


/**
 *
 * @author Aadarsh
 */
public class ex1{
    private int [] Stack;
    private int size;
    private int top=-1;
    ex1(int stacksize)
    {
         size=stacksize;
        Stack = new int[size];
        Arrays.fill(Stack,-1);
    }
    
   void push(int ele)
   {
       if(top+1<size)
       {
           top++;
           Stack[top]=ele;
           
       }
       else
       {
           System.out.println("THE STACK IS FULL");
       }
        System.out.println("THE STACK CONTENTS:");
           
       displaytheStack();
   }
   void pop()
   {
       if(top== -1 )
       {
           System.out.println("STACK IS EMPTY");
       }
       else
       {
          
       System.out.println("THE DELETED ELEMENT IS :" + Stack[top]);
        Stack[top]=-1;
       }
        System.out.println("THE STACK CONTENTS:");
           
       displaytheStack();
   }
   void peek()
   {
       System.out.println("The element at the top is:" + Stack[top]);
        System.out.println("THE STACK CONTENTS:");
           
       displaytheStack();
   }
   void displaytheStack()
   {
       for(int i=0; i <size;i++)
       {   System.out.println(Stack[i]);
       }
   }
   
    public static void main(String args[])
    {
        ex1 e = new ex1(10);
        e.push(5);
        e.push(6);
        e.push(7);
        e.pop();
    }

}

