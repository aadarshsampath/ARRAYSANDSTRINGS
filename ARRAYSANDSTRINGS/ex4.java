/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYSANDSTRINGS;

/**
 *
 * @author Aadarsh
 */
public class ex4 {
    void strcompress(String str)
    {
        String mystr="";
        char p=str.charAt(0);
           int count=1;
       
       for(int i=1;i<str.length();i++)
        {
    
       if(str.charAt(i)== p)
       {
      count++;     
       }
       else
       {
          
          mystr= mystr+p+count;
          
           p=str.charAt(i);
          count=1;
       
          
       }
       

        
        }
         System.out.println(mystr+p+count);
         
    }
    public static void main(String args[])
    {
        ex4 e = new ex4();
        String str="aabbccccc";
        e.strcompress(str);
    }
    
}
