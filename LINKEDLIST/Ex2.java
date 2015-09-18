/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LINKEDLIST;

/**
 *
 * @author Aadarsh
 */
public class Ex2 {
    


    LinkedListNode nthtolast(LinkedListNode head,int k)
    {
        if(k<=0)
        {
            return null;
        }
        LinkedListNode p1=head;
        LinkedListNode p2=head;
        
        for(int i=0;i<k-1;i++)
        {
            if(p2== null)
            {
                return null;
            }
                p2=p2.next;
            }
        while(p2.next !=null)
        {
            p1=p1.next;
            p2=p2.next;
            
        }
        return p1;
    }
    
}



 