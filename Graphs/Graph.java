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
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // Creating a new DAG for topological sort
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 5, 1));
    }

    // BFS -breadth first search , Time complexity is 0(V+E)
    public static void bfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];

        q.add(0); // 0-is source
        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) { // it means that visited array is not visited yet ...so now mark it as true
                // first print curr , 2 mark visited as true , 3rd add neighbour of curr
                System.out.println(curr + " ");
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i); // src ,dest,wt
                    q.add(e.dest);
                }

            }
        }
    }

    // DFS -Depth first search
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        // Visit
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    // Has Path -->question
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) {
        if (src == dest) {
            return true;
        }
        vis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    // ---------------------------
    // Topological sort using BFS
    // indegree ,update neighbor indegre by dec 1 , add node to q if it has
    // indegree==0
    public static void calIndeg(ArrayList<Edge>[] graph, int indeg[]) {
        for (int i = 0; i < graph.length; i++) {
            for (Edge e : graph[i]) {
                indeg[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int indeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        // Calculate indegree of each vertex
        calIndeg(graph, indeg);

        // Add all vertices with indegree 0 to the queue
        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        // Perform BFS
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    // --------- Print All path------------
    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path + dest);
            return;
        }
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            printAllPath(graph, e.dest, dest, path);
        }

    }

    // -------- Dijkstra shortest path alg from source to all vertices

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; // psth based sorting for path
        }
    }

    public static void dijkstra(ArrayList<Edge> graph[], int src) {
    int dist[]=new int[graph.length];
    for(int i=0;i<graph.length;i++){
        dist[i]=Integer.MAX_VALUE;
    }
    boolean vis[]=new boolean[graph.length];
    PriorityQueue<Pair>pq=new PriorityQueue<>();
    pq.add(new Pair(src,0));

    while(!pq.isEmpty()){
        Pair curr=pq.remove();
         if(!vis[curr.n]){
         vis[curr.n]=true;
         for(int i=0;i<graph[curr.n].size();i++){
            Edge e=graph[curr.n].get(i);
            int u=e.src;
            int v=e.dest;
            int wt=e.wt;

            if(dist[u]+wt<dist[v]){ //update distance of src to v;
                dist[v]=dist[u]+wt;
                pq.add(new Pair(v,dist[v]));
            }
         }
         }
    }
    
    //print all source to vertices shortest path 
    for(int i=0;i<dist.length;i++){
        System.out.print(dist[i]+" ");
    }
    System.out.println();
    }

    // ----------------------------------------
    public static void main(String args[]) {
        // int v = 5;
        // ArrayList<Edge>[] graph = new ArrayList[v]; // null -->khali ...khuv=ch bhi
        // defined nhi hain
        // empty arraylist hain

        // for (int i = 0; i < v; i++) {
        // graph[i] = new ArrayList<>();
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
        // Edge e=graph[3].get(i); //src,dest, wt
        // System.out.println(e.dest);
        // }
        // 1
        // 2

        // -------------------------

        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v]; // null -->khali ...khuv=ch bhi defined nhi hain
        createGraph(graph);
        // bfs
        // System.out.println("BFS");
        // bfs(graph);

        // dfs
        // graph,src,vis
        // System.out.println("DFS");
        // dfs(graph,0,new boolean[v]);

        // hasPath
        // System.out.println("Has Path");
        // System.out.println(hasPath(graph, 0, 5,new boolean[v])); // true

        // topological sort - kahns algorithms
        // topSort(graph);

        // int src=2 ,dest=5;
        // printAllPath(graph, src, dest, "");

        // Dijkstras shortest path from all verices algorithm
        int src=0;
        dijkstra(graph, src);
    }
}