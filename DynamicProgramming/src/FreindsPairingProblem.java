public class FreindsPairingProblem {
    public long countFriendsPairings(int n)
    {
        if(n<=2) return n;
        long[] dp = new long[n];
        return help(n,dp);

    }
    public long help(int n,long[] dp){
        if(n<=2) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = help(n-1,dp) + (n-1)*help(n-2,dp);

}
}
