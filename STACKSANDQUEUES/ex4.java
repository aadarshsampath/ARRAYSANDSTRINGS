/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package STACKSANDQUEUES;

import java.util.Scanner;

/**
 *
 * @author Aadarsh
 */
public class ex4 {
    public void solve(int n,String start,String aux,String end)
    {
        if(n==1)
        {
            System.out.println(start+ "-> "+end);
        }
        else
        {
            solve(n-1,start,end,aux);
            System.out.println(start + "-> "+end);
            solve(n-1,aux,start,end);
        }
    }
    public static void main(String args[])
    {
        ex4 e = new ex4();
        System.out.println("WELCOME TO TOWER OF HANOI");
        System.out.println("ENTER THE NUMBER OF DISKS:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        e.solve(n, "A", "B","C");
    }
    
    
}
