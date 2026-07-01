public class ToplogicalSortingKhansAlgo {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int[] vis = new int[V];
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        for(int i=0;i<V;i++){
            a.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            a.get(u).add(v);
        }

        for(int i=0;i<edges.length;i++){
            int ele = edges[i][1];
            vis[ele] = vis[ele] + 1;
        }

        BSF(a,ans,vis);
        return ans;

    }

    public void  BSF(ArrayList<ArrayList<Integer>> a,ArrayList<Integer> ans,int[] vis){
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<vis.length;i++){
            if(vis[i] ==0){
                q.add(i);
            }
        }
        while(q.size()>0){
            int f = q.remove();
            for(int ele : a.get(f)){
                if(vis[ele] == 0){
                    q.add(ele);
                }
                vis[ele] = vis[ele] - 1;
                if(vis[ele] == 0){
                    q.add(ele);

                }
            }
            ans.add(f);
        }

    }
}
