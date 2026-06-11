public class mimi_cost_climb_stairs {
    static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(jump(cost,0,dp),jump(cost,1,dp));

    }

    static int jump(int[] cost,int idx , int[] dp){
        if(idx >= cost.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        int ans = cost[idx] + Math.min(jump(cost,idx+1,dp),jump(cost,idx+2,dp));
        dp[idx] = ans;
        return ans;
    }
}
