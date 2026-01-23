class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int Mcount = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i] == 1){
                count++;
                Mcount = Math.max(count,Mcount);
            }else{
                count =0;
            }
        }
        return Mcount;
    }
}
