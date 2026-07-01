public class LIS_TABULATION {
    static int lis(int arr[]) {
        // code here
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int maxlen = 1;
        for(int idx = 1;idx<n;idx++){
            int max = 0;
            for(int i = 0;i<idx;i++){
                if(arr[idx]>arr[i]){
                    max = Math.max(max,dp[i]);
                }
            }
            dp[idx] += max;
            maxlen = Math.max(maxlen,dp[idx]);

        }
        return maxlen;

    }
}
