import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsUsingAdjList {
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

        public void bfs(int n) {
            boolean[] visits = new boolean[V];
            Queue<Integer> q = new LinkedList<>();
            visits[n] = true;
            q.offer(n);
            while (!q.isEmpty()) {
                int u = q.poll();
                System.out.print(u + " ");
                for (int w : adj[u]) {
                    if (!visits[w]) {
                        visits[w] = true;
                        q.offer(w);
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
        BfsUsingAdjList outer = new BfsUsingAdjList();
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

        System.out.println("Enter the starting vertex for BFS:");
        int startVertex = sc.nextInt();
        System.out.println("BFS traversal starting from vertex " + startVertex + ":");
        g.bfs(startVertex);
    }
}
