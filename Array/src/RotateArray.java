class Solution {
    public void reverse(int[] nums,int d,int k){
        int n = nums.length;
        d =0;
        k = n;
        int temp;
        while(d<k){
            temp = nums[d];
            nums[d] = nums[k];
            nums[k] = temp;
            d++;
            k--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k =k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
}
