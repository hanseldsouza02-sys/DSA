public class FreindsPairingProblem {
    public long countFriendsPairings(int n)
    {
        if(n<=2) return n;
        long[] dp = new long[n];
        return help(n,dp);

    }
    public long help(int n,int[] dp){
        if(n<=2) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = help(n-1) + (n-1)*help(n-2);

}
}
