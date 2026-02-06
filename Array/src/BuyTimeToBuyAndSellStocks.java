class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxPro = 0;
        int min = prices[0];
        for(int i = 1;i<n;i++){
            min = Math.min(min,prices[i]);
            maxPro = Math.max(maxPro,prices[i] - min);

        }
        return maxPro;

    }
}