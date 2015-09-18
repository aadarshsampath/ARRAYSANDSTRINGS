/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STACKSANDQUEUES;

/**
 *
 * @author Aadarsh
 */
public class Mystack {
    
    int myarray[];
    int size;
    int top;
    public Mystack(int s)
    {
        size=s;
        myarray=new int[s];
        int top=-1;
    }
    public void push(int ele)
    {
        myarray[top++]=ele;
    }
    public void pop()
    {
        myarray[top]=0;
        top--;
 
        
    }
    public int peak()
    {
        return myarray[top];
    }
    public boolean isempty()
    {
        return (top==-1);
    }
    public boolean isfull()
    {
        return (top==size-1);
    }
    public void displaystack()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(myarray[i]);
        }
    }
    public void checkmin()
    {
        int min=myarray[0];
        for(int i=0;i<size;i++)
        {
            if(myarray[i]<myarray[0])
            {
                min=myarray[i];
            }
            
        }
        System.out.println("the minimum is "+min);
    }
    public static void main(String args[])
    {
        Mystack e = new Mystack(10);
        e.push(3);
        e.push(4);
        e.push(6);
        e.push(7);
        e.push(11);
        e.push(33);
        e.push(2);
        e.push(22);
        e.push(44);
        e.pop();
        e.pop();
        e.pop();
        
        e.displaystack();
        System.out.println("PEAK IS :"+e.peak());
        e.checkmin();
        
    
    }
}
