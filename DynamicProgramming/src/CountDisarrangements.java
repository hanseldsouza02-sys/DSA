import java.util.Arrays;

public class CountDisarrangements {
    public int derangeCount(int n) {
        // code here
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return help(n,dp);
    }
    public int help(int n,int[] dp){
        if(n<=3) return n-1;
        if(dp[n] != -1) return dp[n];
        return dp[n] = (n-1)*(derangeCount(n-2)+derangeCount(n-1));
    }

    // tabulation
    public int derangeCountTab(int n) {
        // code here
        if(n == 1) return 0;
        int[] dp = new int[n+1];
        dp[1] = 0;
        dp[2] = 1;
        for(int i =3;i<=n;i++){
            dp[i] = (i-1)*(dp[i-2] + dp[i-1]);
        }
        return dp[n];
    }

}
