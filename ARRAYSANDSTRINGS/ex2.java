/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYSANDSTRINGS;

/**
 *
 * @author Aadarsh
 */
public class ex2 {
    void checkperm(String str1,String str2)
    {
        int val1=0,val2=0;
        for(int i=0;i<str1.length();i++)
        {
             val1=val1+str1.charAt(i);
             
        }
        System.out.println(val1);
        for(int i=0;i<str2.length();i++)
        {
             val2=val2+str2.charAt(i);
             
        }
        System.out.println(val2);
        if(val1==val2)
        {
            System.out.println("THE STRINGS ARE ANAGRAMS");
        }
        else
        {
            System.out.println("THE STRINGS ARE NOT ANAGRAMS");
        }
        
    }
    
    
    public static void main(String args[])
    {
        String str1="aadarhs";
        String str2="aadarsh";
        ex2 e = new ex2();
        e.checkperm(str1, str2);
    }
}
