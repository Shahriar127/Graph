import java.util.LinkedList;
import java.util.Scanner;

public class AdjList {
      int V;
      int E;
      LinkedList<Integer>[] adj;
      public AdjList(int nodes){
            this.V = nodes;
            this.E = 0;
            this.adj = new LinkedList[nodes];

            for(int i = 0;i < V; i++){
                  adj[i] = new LinkedList<>();
            }
      }
      public void addEdge(int v,int u){
            adj[v].add(u);
            adj[u].add(v);
            E++;
      }
      public String toString(){
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i < V; i++){
                sb.append(i + " : ");
                for(int w : adj[i]){
                    sb.append(w + " ");
                }
                sb.append("\n");
            }
            return sb.toString();   
      }

      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int numOfVertex = sc.nextInt();
            AdjList g = new AdjList(numOfVertex);
            for(int i = 0;i < numOfVertex; i++){
                  int v = sc.nextInt();
                  int u = sc.nextInt();
                  g.addEdge(v,u);
            }
            System.out.println(g);
      }
}
