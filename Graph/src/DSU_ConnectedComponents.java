import java.util.*;

public class DSU_ConnectedComponents {
    class Solution {
        static class DSU{
            int[] parent;
            int[] size;
            DSU(int V){
                parent = new int[V];
                size = new int[V];
                Arrays.fill(size,1);
                for(int i=0;i<V;i++){
                    parent[i] = i;
                }
            }

            int GroupLP(int n) {
                if (parent[n] == n) return n;
                return parent[n] = GroupLP(parent[n]);
            }
            void union(int a,int b){
                int grpLda = GroupLP(a);
                int grpLdb = GroupLP(b);
                if(size[grpLda] > size[grpLdb]){
                    parent[grpLdb] = grpLda;
                    size[grpLda] += size[grpLdb];
                }else{
                    parent[grpLda] = grpLdb;
                    size[grpLdb] += size[grpLda];

                }

            }
        }
        int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
            // code here
            DSU q = new DSU(V);
            int[][] mat = new int[V][V];
            for(int i =0;i<V;i++){
                for(int j=0;j<V;j++){
                    mat[i][j] = 0;
                }
            }

            for(int i=0;i<edges.size();i++){
                int u = edges.get(i).get(0);
                int v = edges.get(i).get(1);
                mat[u][v] = 1;
                mat[v][u] = 1;
            }


            for(int i=0;i<V;i++){
                for(int j=0;j<V;j++){
                    if(mat[i][j] == 1 ){
                        if(q.GroupLP(i) != q.GroupLP(j)){
                            q.union(i,j);
                        }
                    }

                }
            }

            int count =0;
            for(int i =0;i<V;i++){
                if(q.parent[i] == i){
                    count++;
                }
            }
            return count;

        }
    }
}
