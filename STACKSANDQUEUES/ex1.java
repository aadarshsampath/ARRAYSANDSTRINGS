/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STACKSANDQUEUES;

/**
 *
 * @author Aadarsh
 */
public class ex1 {
    
    int stackptr[]={1,1,1};
    int stacksize=5;
    int buff[]=new int[stacksize*3];
    
    public void push(int top,int num)
    {
        if(stackptr[top]+1>stacksize)
        {
            System.out.println("stack is full");
            
        }
        
            stackptr[top]++;
            buff[abstop(top)]=num;
            
        
          
    }
    public int pop(int top)
    {
        if(stackptr[top]==-1)
        {
            System.out.println("stack is empty");
        }
        
            int val=buff[abstop(top)];
            buff[abstop(top)]=0;
            stackptr[top]--;
            return val;
        }
    
    
    public int peak(int top)
    {
        int val=buff[abstop(top)];
        return val;
    }
    public boolean isempty(int top)
    {
        return (stackptr[top]==-1);
    }
    
    int abstop(int top)
    {
        return top*stacksize+stackptr[top];
    }
    
    public void display()
    {
        for (int i=0;i <buff.length;i++)
        {
            System.out.println(buff[i]);
        }
    }
public static void main(String args[])
{
ex1 e = new ex1();
e.push(2, 5);
e.push(1, 7);
e.display();
}
}


