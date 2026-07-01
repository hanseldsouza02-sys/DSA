public class lcs_Tabulation {
    static int lcs(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                int x = (i>=1 && j>=1) ? dp[i-1][j-1] : 0;
                int y = (i>=1) ? dp[i-1][j] : 0;
                int z = (j>=1) ? dp[i][j-1] : 0;
                if(s1.charAt(i) == s2.charAt(j)) dp[i][j] = 1 + x;
                else dp[i][j] = Math.max(y,z);
            }
        }
        return dp[n-1][m-1];

    }
}
