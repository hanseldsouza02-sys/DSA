import java.util.*;


public class DsuImplementation {
    static class DSU{
        int[] parent;
        int[] size;
        DSU(int V){
            parent = new int[V];
            size = new int[V];
            Arrays.fill(size,1);
            Arrays.fill(parent,-1);
        }
        void make(int n){
            parent[n] = n;
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
    public static void main(String[] args) {
        DSU dsu = new DSU(6);
        dsu.make(0);
        dsu.make(1);
        dsu.make(2);
        dsu.make(3);
        dsu.make(4);
        dsu.make(5);






    }
}
