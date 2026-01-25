class Solution {
    public int subarraySum(int[] nums, int k) {

        //BRUTE FORCE SOLUTION

        int n = nums.length;
        int len = 0;
        for(int i =0;i<n;i++){
            for(int j = i;j<n;j++){
                int s = 0;
                for(int h = i;h<=j;h++){
                    s += nums[h];
                    if(s == k){
                        len = Math.max(len,j-i+1);
                    }
                }
            }
        }
        return len;

        //BETTER SOLUTION O(N^2)

        int n = nums.length;
        int len = 0;
        for(int i =0;i<n;i++){
            int s =0;
            for(int j = i;j<n;j++){
                s += nums[j];
                if(s == k){
                        len = Math.max(len,j-i+1);
                    }
                }
            }
        }
        return len;


    }
}