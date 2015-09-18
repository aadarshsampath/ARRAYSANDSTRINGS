/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author Aadarsh
 */
public class Mydoublelinklist {

    public String name;
    public int housenum;
    Mydoublelinklist next;
    Mydoublelinklist previous;

    public Mydoublelinklist(String name,int housenum) {
        this.name=name;
        this.housenum=housenum;
        
    }
    
    public void display()
    {
        System.out.println("HOUSE OWNER NAME:"+ name + "   HOUSE NUM:"+ housenum);
    }
    
    public String tostring()
    {  if(name==null)
    {
        return null;
    }
    else
    {
        return name;
    }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Doublelinklist d = new Doublelinklist();
        d.insertfirst("Aadarsh", 1);
        d.insertfirst("Dult", 5);
        d.insertfirst("pacha", 6);
        d.insertlast("sanji", 7);
        d.display();
    }
   
}

 class Doublelinklist{
    
     Mydoublelinklist firstlink;
     Mydoublelinklist lastlink;
     
     public void insertfirst(String name,int housenum)
     {
         Mydoublelinklist insfirst = new Mydoublelinklist(name, housenum);
         if(isEmpty())
         {
             lastlink=insfirst;
         }
         
         
            insfirst.next=firstlink;
            firstlink=insfirst;
     }
     public void insertlast(String name,int housenum)
     {
         Mydoublelinklist inslast = new Mydoublelinklist(name, housenum);
         if(isEmpty())
         {
             firstlink=inslast;
         }
         else
         {
         lastlink.next=inslast;
         
         }
         lastlink = inslast;
     }
     public boolean isEmpty()
     {
         return(firstlink==null);
     }
      public void display()
    {
     Mydoublelinklist thelink=firstlink ;
     while(thelink!=null)
     {
         thelink.display();
         System.out.println("NEXT LINK:" + thelink.next);
         thelink=thelink.next;
         System.out.println();
     }
     
     
    }
}
