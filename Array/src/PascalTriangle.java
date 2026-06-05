class Solution {

    //BRUTE BUT WILL NOT WORK BECAUSE OF INT
    public int fact(int n){
        int k = 1;
        for(int i =1;i <= n;i++){
            k *= i;
        }
        return k;
    }
    public int  comb(int n,int r){
        int c = 0;
        c = fact(n)/((fact(r))*fact(n-r));
        return c;

    }
    public List<List<Integer>> generate(int n) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0;i<n;i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j = 0 ;j<=i;j++){
                int q =  comb(i,j);
                a.add(q);
            }
            ans.add(a);
        }
        return ans;

    }

    //Pascal triangle but 1st case

    public int comb(int r, int c){
        int res = 1;
        for(int i =0;i<c;i++){
            res = res*(r-i);
            res = res/(i+1);
        }
        return res;
    }

    //OPTIMAL SOLUTION

    List<List<Integer>> ans = new ArrayList<>();
    long res = 1;

        for(int i = 0; i< n ;i++){
        List<Integer> a = new ArrayList<>();
        res = 1;
        for(int j = 0;j<=i;j++){
            a.add((int)res);
            res =res*(i-j);
            res = res/(j+1);
        }
        ans.add(a);
    }
        return ans;

}