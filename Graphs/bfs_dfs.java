import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_dfs {
    // -------- DFS -----------
    // https://www.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1
     public static void dfs(int curr,boolean vis[],ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>ls){
        vis[curr]=true;
        ls.add(curr);
        for(Integer it:adj.get(curr)){
            if(vis[it]==false){
            dfs(it,vis,adj,ls);
            }
        }
    }
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[]=new boolean[V+1];
        vis[0]=true;
        
        ArrayList<Integer>ls=new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
    }

    // .......... BFS ...........
    // https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>bfs=new ArrayList<>();
        boolean vis[]=new boolean[V];
        Queue<Integer>q=new LinkedList<>();
        
        q.add(0);
        vis[0]=true;
        
        while(!q.isEmpty()){
            Integer node=q.remove();
            bfs.add(node);
            
            // get all adjacency vertices of the dequeued vertices ,if not vis ,mark vis and enque 
            for(Integer it:adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }


}
