/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LINKEDLIST;

/**
 *
 * @author Aadarsh
 */
public class ex6 {
    
    LinkedListNode findbeg(LinkedListNode head)
    {
        LinkedListNode fast=head;
        LinkedListNode slow=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        
            if(fast==slow)
                break;
        }
        
        while(fast==null|| fast.next==null)
        {
            return null;
        }
        
        slow=head;
        while(slow!=fast)
        {
           slow=slow.next;
           fast=fast.next;
        }
        return fast;
    }
    
}
