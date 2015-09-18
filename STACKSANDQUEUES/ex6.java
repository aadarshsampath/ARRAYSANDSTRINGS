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
public class ex6 {
    public void sort(Stack  s)
    {
        Stack r = new Stack();
        while(!s.isEmpty())
        {
            int temp = (int) s.pop();
            while(!r.isEmpty())
            {
                s.push(r.pop());
            }
            r.push(temp);
        }
        System.out.println("stack is"+ r);
    }
    
}
