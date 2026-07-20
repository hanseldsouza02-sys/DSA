import java.util.*;

public class NumberOfConnectedComponents {
    public int findNumberOfComponents(int V, ArrayList<ArrayList<Integer>> edges) {
    // code here
    int n = V;
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
        graph.add(new ArrayList<>());
        for (int j = 0; j < n; j++) {
            graph.get(i).add(0);
        }
    }
        for(ArrayList<Integer> ele:edges){
        int u = ele.get(0);
        int v = ele.get(1);

        graph.get(u).set(v,1);
        graph.get(v).set(u,1);

    }
    int m = graph.size();
    boolean[] visted = new boolean[n];
    int count =0;
        for(int i=0;i<m;i++){

        if(!visted[i]){
            BFS(i,graph,visted);
            count++;
        }
    }
    return count;
}
static void  BFS(int i, ArrayList<ArrayList<Integer>> graph,boolean[] visted){
    int n = graph.size();
    Queue<Integer> q = new LinkedList<>();
    q.add(i);
    visted[i] = true;
    while(q.size() > 0){
        int front = q.remove();
        for(int j =0;j<n;j++){
            if(graph.get(front).get(j) == 1 && !visted[j]){
                q.add(j);
                visted[j] = true;
            }
        }

    }
}
}
