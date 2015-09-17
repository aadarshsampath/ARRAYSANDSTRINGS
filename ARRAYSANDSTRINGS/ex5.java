/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYSANDSTRINGS;


/**
 *
 * @author Aadarsh
 */
public class ex5 {
    public void setzeros(int mat[][])
    {
     boolean row[] = new boolean[mat.length];
     boolean column[]=new boolean[mat.length];
        
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(mat[i][j]==0)
                {
                    row[i]=true;
                    column[j]=true;
                }
            }
        }
        for(int i=0;i<row.length;i++)
        {
            if(row[i])
            {
                nullifyrow(mat,i);
                
            }
        }
        for(int j=0;j<column.length;j++)
        {
            if(column[j])
            {
                nullifycol(mat,j);
            }
        }
        
    }
    void nullifyrow(int mat[][],int row)
    {
            for(int j=0;j<mat.length;j++)
            {
            mat[row][j]=0;
        
        }
    }
    void nullifycol(int mat[][],int column)
    {
        for(int i=0;i<mat.length;i++)
        {
            mat[i][column]=0;
        }
        
    }
    
    
        
    
    

    public static void main(String args[])
    {
        int[][] mat = new int[][]{
  { 22,10, 33,44, 0, 66, 2, 8, 9, 11 },
  { 0, 70, 70, 70, 80, 90, 0, 40, 30, 20 },
  };
        ex5 e = new ex5();
        e.setzeros(mat);
    for(int i=0;i<mat.length;i++)
    {
        for(int j=0;j<mat.length;j++)
        {
            System.out.println(mat[i][j]);
        }
    }
        
    }
    
}
