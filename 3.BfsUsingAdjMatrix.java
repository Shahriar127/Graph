import java.util.LinkedList;
import java.util.Queue;

public class BfsUsingJava {
    int V;
    int E;
    int[][] adjMatrix;

    public BfsUsingJava(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
        E++;
    }

//     public String toString() {
//         StringBuilder sb = new StringBuilder();
//         sb.append(V + " vertices, " + E + " edges " + "\n");
//         for (int v = 0; v < V; v++) {
//             sb.append(v + ": ");
//             for (int w = 0; w < V; w++) {
//                 sb.append(adjMatrix[v][w] + " ");
//             }
//             sb.append("\n");
//         }
//         return sb.toString();
//     }

    public void bfs(int n) {
        boolean[] visits = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visits[n] = true;
        q.offer(n);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int w = 0; w < V; w++) {
                if (adjMatrix[u][w] == 1 && !visits[w]) {
                    visits[w] = true;
                    q.offer(w);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BfsUsingJava g = new BfsUsingJava(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        g.bfs(0);
        // System.out.println(g);  // Implicitly calls g.toString()
    }
}
