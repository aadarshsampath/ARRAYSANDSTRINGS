/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYSANDSTRINGS;

/**
 *
 * @author Aadarsh
 */
public class ex3 {
    public void replacespaces(char[] str,int length)
    {
        int spcount=0;
        int newlength;
        for(int i=0;i<length;i++)
        {
            if(str[i]==' ')
            {
                spcount++;
            }
        }
         newlength = length + spcount * 2;
         str[newlength]= '\0';
        for(int i=length-1;i>=0;i--)
        {
            if(str[i]==' ')
            {
            str[newlength-1]='0';
            str[newlength-2]='2';
            str[newlength-3]='%';
            newlength=newlength-3;
        }
            else
            {
                str[newlength-1]=str[i];
                newlength = newlength-1;
            }
        }
    }
    public static void main(String args[])
    {
        String str="this is an example sentence";
        char c[]=str.toCharArray();
        int len=str.length();
        ex3 e =new ex3();
        e.replacespaces(c,len);
        
    }
    
}
