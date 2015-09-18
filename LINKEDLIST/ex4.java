/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LINKEDLIST;

/**
 *
 * @author Aadarsh
 */
public class ex4 {
   public LinkedListNode partition(LinkedListNode n ,int x)
   {
       LinkedListNode bstart=null;
       LinkedListNode bend=null;
       LinkedListNode astart=null;
       LinkedListNode aend=null;
       
       while(n!=null)
       {
           LinkedListNode next=n.next;
           n.next=null;
          if(n.data<x)
          {
           if(bstart==null)
           {
               bstart=n;
               bend=bstart;
           }
           else
           {
               bend.next=n;
               bend=n;
           }
          }
          else
          {
              if(astart==null)
              {
                  astart=n;
                  aend=astart;
                  
              }
              else
              {
                  aend.next=n;
                  aend=n;
              }
          }
          n=next;
          
       }
       if(bstart==null)
       {
           return astart;
       }
       
       bend.next=astart;
       return bstart;
       
   }
}