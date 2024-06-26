import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
public class dfsUsingList {

    public class AdjList {
        int V;
        int E;
        LinkedList<Integer>[] adj;

        public AdjList(int nodes) {
            this.V = nodes;
            this.E = 0;
            this.adj = new LinkedList[nodes];

            for (int i = 0; i < V; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        public void addEdge(int v, int u) {
            adj[v].add(u);
            adj[u].add(v);
            E++;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < V; i++) {
                sb.append(i + " : ");
                for (int w : adj[i]) {
                    sb.append(w + " ");
                }
                sb.append("\n");
            }
            return sb.toString();
        }


public void dfs(int n) {
    boolean[] visits = new boolean[V];
    Stack<Integer> stack = new Stack<>();
    stack.push(n);

    while (!stack.isEmpty()) {
        int node = stack.pop();
        if (!visits[node]) {
            visits[node] = true;
            System.out.print(node + " ");

            // Push all adjacent unvisited nodes to the stack
            for (int w : adj[node]) {
                if (!visits[w]) {
                    stack.push(w);
                }
            }
        }
    }
    System.out.println();
}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int numOfVertex = sc.nextInt();
        dfsUsingList outer = new dfsUsingList();
        AdjList g = outer.new AdjList(numOfVertex);

        System.out.println("Enter the number of edges:");
        int numOfEdges = sc.nextInt();
        System.out.println("Enter the edges (format: v u):");
        for (int i = 0; i < numOfEdges; i++) {
            int v = sc.nextInt();
            int u = sc.nextInt();
            g.addEdge(v, u);
        }

        System.out.println("Graph representation:");
        System.out.println(g);

        System.out.println("Enter the starting vertex for DFS:");
        int startVertexDfs = sc.nextInt();
        System.out.println("DFS traversal starting from vertex " + startVertexDfs + ":");
        g.dfs(startVertexDfs);
    }
}


