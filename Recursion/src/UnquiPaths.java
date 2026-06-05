public class UnquiPaths {
    public int uniquePaths(int m, int n) {
        int t = m + n -2;
        int r = Math.min(m-1,n-1);

        long ans = 1;
        for(int i =1;i<=r;i++){
            ans = (ans * (t - r + i))/i;
        }
        return (int)ans;

    }

    // Method 2
    public int paths(int cr,int cc,int er,int ec){
        if(cr == er &&  cc == ec) return 1;
        if(cr > er || cc > ec) return 0;
        return paths(cr+1,cc,er,ec) + paths(cr,cc+1,er,ec);
    }
    public int uniquePaths(int m, int n) {
        return paths(0,0,m-1,n-1);
    }
}
