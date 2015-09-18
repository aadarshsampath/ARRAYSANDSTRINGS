/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.Arrays;

/**
 *
 * @author Aadarsh
 */
public class Hashtable {
    int array[];
    int arraysize;
    
    
    Hashtable(int size)
    {
        arraysize=size;
        array=new int[size];
        Arrays.fill(array, -1);
    }
    
   /* public void hashfunction(int toaddarray[],int array[])
    {
        for(int i=0;i<toaddarray.length;i++)
        {
            int thenewele=toaddarray[i];
            array[thenewele]=thenewele;
        }
    }*/
    public void hashfunction2(int toaddarray[],int array[])
    {
        for(int i=0;i<toaddarray.length;i++)
        {
            int newele=toaddarray[i];
            int arrayindex=(newele) % 29;
            System.out.println("ARRAY INDEX:"+arrayindex+"FOR ELEMENT:"+newele);
            while(array[arrayindex] != -1)
            {
                ++arrayindex;
                System.out.println("COLLISION TRY ARRAY INDEX"+arrayindex+"INSTEAD");
                arrayindex%=arraysize;
            }
        array[arrayindex]=newele;
        }
    }
    public int findkey(int key)
    {
        int arrayindexhash=key%29;
        while(array[arrayindexhash]!=-1)
        {
            if(array[arrayindexhash]==key)
            {
                System.out.println(key+"was found in index"+arrayindexhash);
                return array[arrayindexhash];
            }
            ++arrayindexhash;
            arrayindexhash%=arraysize;
        }
        return 0;
    }
    void displayhash()
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(i+"th"+"position:"+array[i]);
        }
    }
    public static void main(String args[])
    {
        Hashtable h = new Hashtable(30);
       // int toaddarray[]={1,7,9,15,22};
       // h.hashfunction(toaddarray, h.array);
        int toaddarray2[]={45,55,333,222,777,822,567,256,981,225};
        h.hashfunction2(toaddarray2, h.array);
        h.displayhash();
        h.findkey(567);
    }
    
}
