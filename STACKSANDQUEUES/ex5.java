/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STACKSANDQUEUES;

import java.util.Stack;

/**
 *
 * @author Aadarsh
 */
public class ex5<T> {
    Stack <T> stacknew,stackold;
    public ex5()
    {
        stacknew = new Stack<>();
        stackold=new Stack<>();
        
    }
    
    public void add(T v)
    {
        stacknew.push(v);
    }
    public void changestacks()
    {
        if(stackold.isEmpty())
        {
        while(!stacknew.isEmpty())
        {
            
                stackold.push(stacknew.pop());
            
        }
    }
    }
    public T remove()
    {
        changestacks();
        return stackold.pop();
    }
    public T peek()
    {
        changestacks();
        return stackold.peek();
    }
    
}
