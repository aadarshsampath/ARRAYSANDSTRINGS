/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TREESANDGRAPHS;

/**
 *
 * @author Aadarsh
 */
public class bst {
    
    
    public static void main(String args[])
    {
        bst b = new bst();
        b.run();
    }
   
  public class Node
   {
    Node left;
    Node right;
    int value;
    
    public Node(int value)
    {
        this.value=value;
    }
    
    
   }
   
    void insertbst(Node n,int val)
 {
     if(val<n.value)
     {
   if(n.left!=null)
   {
   insertbst(n.left,val);
   
   }
   else
   {
       System.out.println("  Inserted " + val + " to left of "
            + n.value);
        n.left = new Node(val);
   }
         
     }
     
     if(val>n.value)
     {
         if(n.right!=null)
         {
             insertbst(n.right,val);
         }
         else
         {
             System.out.println("  Inserted " + val + " to the right of" + n.value);
             n.right=new Node(val);
         }
     }
     
     
 }
    
    
    public void printInOrder(Node node) {
    if (node != null) {
      printInOrder(node.left);
      System.out.println("  Traversed " + node.value);
      printInOrder(node.right);
    }
  }



public void run()
{
    bst b = new bst();
    Node n;
      n = new Node(5);
    
    System.out.println("Binary Tree Example");
    System.out.println("Building tree with root value " + n.value);
    b.insertbst(n, 1);
    b.insertbst(n, 8);
    b.insertbst(n, 6);
    b.insertbst(n, 3);
    b.insertbst(n, 9);
    System.out.println("Traversing tree in order");
    printInOrder(n); 
    
    
    
}

 


}