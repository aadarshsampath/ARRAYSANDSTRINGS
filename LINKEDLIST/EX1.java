/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LINKEDLIST;

import DataStructures.Hashtable;
import java.util.LinkedList;

/**
 *
 * @author Aadarsh
 */
public class EX1 {
    public void removeduplicates(LinkedListNode n)
    {
        LinkedListNode prev=null;
        com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable h = new com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable();
        while(n!=null)
        {
            if(h.containsKey(n.data))
            {
                prev.next=n.next;
            }
            else
            {
                h.put(n.data, true);
                prev=n;
            }
            n=n.next;
        }
        
    }
       public static void main(String args[])
    {
    LinkedList1 l1;
            l1 = new LinkedList1();
    EX1 e = new EX1();
   LinkedListNode n = new LinkedListNode(1);
   n = new LinkedListNode(2);
   n = new LinkedListNode(3);
   n = new LinkedListNode(4);
   n = new LinkedListNode(1);
   n = new LinkedListNode(2);
   
//    l1.insert(1);
//   l1.insert(2);
//   l1.insert(3);
//   l1.insert(2);
//   l1.insert(1);
//   l1.insert(2);
//   l1.printList();
   e.removeduplicates(n);
   n.printlink();
   
    }
    
}


    
    class LinkedListNode
            {
        public int data;
        LinkedListNode next;
        
        public LinkedListNode(int data)
        {
            int d=data;
        }

    LinkedListNode() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        public void printlink()
        {
            System.out.println("data is:"+data);
        }
            }
    
    class LinkedList1
    {
        private LinkedListNode first;
        
        public LinkedList1()
        {
            first=null;
            
        }
        
        public boolean isEmpty()
        {
            return first==null;
        }
        public void insert(int data)
        {
            LinkedListNode n = new LinkedListNode(data);
            n.next = first;
            first=n;
        }
        public LinkedListNode delete()
        {
            LinkedListNode temp=first;
            first=first.next;
            return temp;
        }
        
        public void printList() {
	    LinkedListNode currentLink = first;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.printlink();
		    currentLink = currentLink.next;
	    }
	    System.out.println("");
    }
    }

    
 