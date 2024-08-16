import java.util.*;

public class Graph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }


    // Time complexity is 0(n)
    public static void createGraph(ArrayList<Edge>graph[]){
        for (int i = 0; i <graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0->vertex
        graph[0].add(new Edge(0, 1, 5));
        // 1->vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // vertex 2
        graph[2].add(new Edge(2, 0, 5));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 4));

        // 3 - verte
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3,5,5));

        // 4 vertex
        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4,5,5));

        // vertex 5
        graph[5].add(new Edge(5,4,5));
        graph[5].add(new Edge(5,3,5));
    }


    // BFS -breadth first search  , Time complexity is 0(V+E)
    public static void bfs(ArrayList<Edge>[]graph){
        Queue<Integer>q=new LinkedList<>();
        boolean[] visited=new boolean[graph.length];

        q.add(0); //0-is source 
        while(!q.isEmpty()){
            int curr=q.remove();

            if(!visited[curr]){ //it means that visited array is not visited yet ...so now mark it as true 
                // first print curr , 2 mark visited as true , 3rd add neighbour of curr 
                System.out.println(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i); //src ,dest,wt
                    q.add(e.dest);
                }

            }
        }
    }

    // DFS -Depth first search 
    public static void dfs(ArrayList<Edge>[]graph,int curr,boolean vis[]){
        // Visit
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }

    // Has Path -->question 
    public static boolean hasPath(ArrayList<Edge>[]graph,int src,int dest,boolean vis[]){
        if(src==dest){
            return true;
        } 
        vis[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!vis[e.dest]&& hasPath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        // int v = 5;
        // ArrayList<Edge>[] graph = new ArrayList[v]; // null -->khali ...khuv=ch bhi defined nhi hain
        // empty arraylist hain

        // for (int i = 0; i < v; i++) {
        //     graph[i] = new ArrayList<>();
        // }

        // // 0->vertex
        // graph[0].add(new Edge(0, 1, 5));
        // // 1->vertex
        // graph[1].add(new Edge(1, 0, 5));
        // graph[1].add(new Edge(1, 2, 1));
        // graph[1].add(new Edge(1, 3, 3));

        // // vertex 2
        // graph[2].add(new Edge(2, 0, 5));
        // graph[2].add(new Edge(2, 1, 1));
        // graph[2].add(new Edge(2, 4, 4));

        // // 3 - verte
        // graph[3].add(new Edge(3, 1, 3));
        // graph[3].add(new Edge(3, 2, 1));

        // // 4 vertex
        // graph[4].add(new Edge(4, 2, 2));

        // find 3's neighbour 
        // for(int i=0;i<graph[3].size();i++){
        //     Edge e=graph[3].get(i); //src,dest, wt
        //     System.out.println(e.dest);
        // }
        // 1
        // 2


        // -------------------------

        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v]; // null -->khali ...khuv=ch bhi defined nhi hain
        createGraph(graph);
        // bfs 
        // System.out.println("BFS");
        //  bfs(graph);

        // dfs
        //   graph,src,vis
        // System.out.println("DFS");
        // dfs(graph,0,new boolean[v]);

        // hasPath
        System.out.println("Has Path");
        System.out.println(hasPath(graph, 0, 5,new boolean[v])); // true
        

                   

    }
}  