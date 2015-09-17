/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYSANDSTRINGS;

/**
 *
 * @author Aadarsh
 */
public class ex1 {
    public boolean Isunique(String str)
    {
        if(str.length()>256)
        {
            return false;
        }
         boolean[] char_set = new boolean[256];
         for(int i=0;i<str.length();i++)
         {
             int val = str.charAt(i);
             System.out.println(val);
             
        
         if(char_set[val])
         {
           return false;  
         }
         char_set[val]=true;
         }
        return true;
    }
    public static void main(String args[])
    {
        String str="aadarsh";
        ex1 e = new ex1();
        System.out.println(e.Isunique(str));
    }
    
}
