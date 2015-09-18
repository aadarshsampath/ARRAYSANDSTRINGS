/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TREESANDGRAPHS;

import com.sun.corba.se.impl.orbutil.graph.Graph;
import com.sun.corba.se.impl.orbutil.graph.Node;
import java.util.LinkedList;

/**
 *
 * @author Aadarsh
 */
public class ex2 {
    
public enum State
{
    Univisited,Visited,Visiting;
}

public static boolean Bfs(Graph g,bst.Node start, bst.Node end)
{
    
    LinkedList<Node> q = new LinkedList<Node>();
    for(Node u : g.getNodes())
    {
        u.State = State.Univisited;
        
    }
    
    start.State = State.Visiting;
    q.add(start);
    Node u;
    while(!q.isEmpty())
    {
    for(Node v:u.getadjacent())
    {
        if(v.State=State.Univisited)
        {
            if(v==end)
            {
                return true;
            }
            else
            {
                v.State= State.Visiting;
                q.add(v);
            }
        }
    }
    u.State=State.Visited;
    
    
}

return false;

}
}
