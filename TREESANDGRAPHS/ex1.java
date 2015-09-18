/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TREESANDGRAPHS;

/**
 *
 * @author Aadarsh
 */
public class ex1 {
    
    public  int getheight(bst.Node root)
    {
        if(root==null)
            return 0;
        return Math.max(getheight(root.left),getheight(root.right)+1);
    }
    
    public boolean checkbal(bst.Node root)
    {
        if(root==null)
            return true;
        int diff=getheight(root.left)-getheight(root.right);
        if(Math.abs(diff)>1)
            return false;
        else
           return checkbal(root.left) && checkbal(root.right);
        
    }
    public static void main(String args[])
    {
        
    }
    
}
