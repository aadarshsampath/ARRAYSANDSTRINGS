/*
 * To change this templ````````````1`ate, choose Tools | Templates
 * and open the template in the editor.
 */
package STACKSANDQUEUES;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Aadarsh
 */
public class ex2 {
    ArrayList<Stack> stacks = new ArrayList<Stack>();
    public void push(int v)
    {
      Stack last = getlaststack();
      if(last!=null || !last.isFull())
      {
          last.push(v);
      }
        
      else
    {
       Stack stack = new Stack(capacity);
       stack.push(v);
       stacks.add(stack);
    }
    }
    public int pop()
    {
        Stack last = getlaststack();
        int v = 0;
        if(!last.size()==0)
        {
            v = (int) last.pop();
        }
        else
        {
            stacks.remove(stacks.size()-1);
            return v;
        }
    }
    
    
}
