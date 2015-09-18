/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author Aadarsh
 */
public class Mylinkedlist {

    public String bookname;
    public int millionssold;
    Mylinkedlist next;
    
    Mylinkedlist(String bookname,int millionssold)
    {
        this.bookname=bookname;
        this.millionssold=millionssold;
    }
    
    public  void display()
    {
        System.out.println(bookname+ ":"+millionssold + ",000,000 Sold");
    }
    public String tostring()
    {
        return bookname;
    }
    public static void main(String args[])
    {
        Linklist l = new Linklist();
        l.insertfirstlink("HARRY POTTER",500);
        l.insertfirstlink("CRACKCODE", 200);
        l.insertfirstlink("LORD OF THE RINGS", 800);
        l.display();
        l.removelink("LORD OF THE RINGS");
        l.deletefirst();
        l.display();
        System.out.println(l.find("HARRY POTTER").bookname);
    }
}
    class Linklist
    {
        public Mylinkedlist firstlink;
     Linklist()
     {
         firstlink=null;
     }
    public boolean isempty()
    {
        return (firstlink==null);
    }
    public void insertfirstlink(String bookname,int millionssold)
    {
        Mylinkedlist newlink=new Mylinkedlist(bookname, millionssold);
        newlink.next=firstlink;
        firstlink=newlink;
    }
    public Mylinkedlist deletefirst()
    {
       Mylinkedlist reflinkedlist ;
       
       reflinkedlist = firstlink;
       if(!isempty())
       {
       firstlink=firstlink.next;
        }
       else
       {
           System.out.println("EMPTY LINKED LIST:");
       }
       return reflinkedlist;
    }
    public void display()
    {
        Mylinkedlist thelink = firstlink;
        while(thelink!=null)
        {
         thelink.display();
            System.out.println("NEXT LINK:" + thelink.next);
         thelink=thelink.next;
            System.out.println();
        }
        
    }
    public Mylinkedlist find(String bookname)
    {
        Mylinkedlist findlink = firstlink;
        if(!isempty())
        {
            while(findlink.bookname!=bookname)
            {
                if(findlink.next==null)
                {

                    return null;
            }
                else
                {
                    findlink=findlink.next;
                }
            }
            
        }
        else
        {
            System.out.println("EMPTY");
        }
        
        return findlink;
    }
    public Mylinkedlist removelink(String bookname)
    {
        Mylinkedlist currentlink=firstlink;
        Mylinkedlist previouslink = firstlink;
        if(!isempty())
        {
            while(currentlink.bookname!=bookname)
            {
                if(currentlink.next==null)
                {
                    return null;
                }
                else
                {
                    previouslink=currentlink;
                    currentlink=currentlink.next;
                }
                if(currentlink==firstlink)
                {
                    firstlink=firstlink.next;
                }
                else
                {
                    previouslink.next=currentlink.next;
                }
            }
        }
        else
        {
            System.out.println("EMPTY LINKED LIST");
        }
        return currentlink;
    }
    /**
     * 
     * @param args the command line arguments
     */
    
}
