/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LINKEDLIST;

/**
 *
 * @author Aadarsh
 */
public class ex3 {
    
    public static boolean deleteNode(LinkedListNode n)
    {
        if(n==null||n.next==null)
        {
            return false;
        }
        LinkedListNode next = n.next;
        n.data=next.data;
        n.next=next.next;
        
        return true;
    }
    
}
