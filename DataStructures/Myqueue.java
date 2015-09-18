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
public class Myqueue {
   private int myqueue[];
   private int queuesize;
   private int front=0,rear=0,noofitems=0;
   
   Myqueue(int size)
   {
        myqueue=new int[size];
        queuesize=size;
       Arrays.fill(myqueue, -1);
      
       
   }
   public void priorityInsert(int input)
   {
       int i;
       if(noofitems == 0)
       {
           insert(input);
       }
       else
       {
         for(i = noofitems -1 ; i>=0;i--)
         {
             if(input>myqueue[i])
             {
                 myqueue[i+1]=myqueue[i];
             }else
             {
                break;
         }
          myqueue[i+1]=input;
          rear++;
          noofitems++;
                 
       }
   }
   }
     public void insert(int ele)
   {
       if(noofitems+1<=queuesize)
           
       {
           myqueue[rear]=ele;
            
            System.out.println("The inserted item is " + myqueue[rear]);
            rear++;
            noofitems++;
       }
       else
       {
           System.out.println("ERROR");
       }
       queuedisplay();
   }
    public void delete()
    {
        if(noofitems <= 0 )
        {
            System.out.println("No items to delete");
        }
        else
        {   System.out.println("deleted item is:"+myqueue[front]);
            myqueue[front]=-1;
            front++;
            noofitems--;
        }
        queuedisplay();
    }
    public void peek()
    {
        System.out.println("The first element is " + myqueue[front]);
    }
    public void queuedisplay()
    {
        System.out.println("QUEUE IS:");
        for(int i=front ; i<=rear ; i++)
        {
            System.out.println( + myqueue[i]);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
     // TODO code application logic here
    Myqueue m = new Myqueue(10);
    m.insert(3);
    m.insert(5);
    m.insert(8);
    m.delete();
    m.delete();
    m.peek();
    m.priorityInsert(11);
    m.priorityInsert(2);
    }
}
