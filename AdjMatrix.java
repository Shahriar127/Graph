import java.util.*;
public class AdjMatrix {
     int vertexSize;
     int edgeSize;
     int[][] adjMatrix;

     public AdjMatrix(int nodes){
         this.vertexSize = nodes;
         this.edgeSize = 0;
         this.adjMatrix = new int[nodes][nodes];
     }
     public void addEdge(int v,int u){
         adjMatrix[v][u] = 1;
         adjMatrix[u][v] = 1;
         edgeSize++;
     }
      public String toString(){
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < vertexSize ; i++){
            sb.append(i + " : ");
            for(int j = 0;j < vertexSize; j++){
                  sb.append(adjMatrix[i][j] + " ");
            }
            sb.append("\n");
      }
      return sb.toString();
     }

     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         int node = scan.nextInt();
         AdjMatrix g = new AdjMatrix(node);

         for(int i = 0;i < node; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            g.addEdge(x, y);
         }
         System.out.println(g);

     }

}
