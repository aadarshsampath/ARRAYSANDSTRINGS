/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LINKEDLIST;

/**
 *
 * @author Aadarsh
 */
public class ex5 {
    LinkedListNode  addlists(LinkedListNode l1,LinkedListNode l2,int carry)
    {
        if(l1==null&&l2==null&&carry==0)
        {
            return null;
        }
        LinkedListNode result=new LinkedListNode();
        int value=carry;
        if(l1!=null)
        {
            value+=l1.data;
            
        }
        if(l2!=null)
        {
            value+=l2.data;
        }
        result.data=value%10;
        LinkedListNode more=addlists(l1==null?null:l1,l2==null?null:l2,value>10?1:0);
        result.setNext(more);
     
    return result;   
    }
    
    
    
}
