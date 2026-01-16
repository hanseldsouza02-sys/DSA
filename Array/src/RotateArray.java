class Solution {
    public void reverse(int[] nums,int d,int k){
        int i =d;
        int j = k;
        int temp;
        while(i<j){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);


        //BRUTE FORCE

        for (int i = 0; i < k; i++) {
             int last = nums[n-1];
            for(int j = n-1;j>0;i++){
                nums[j] = nums[j-1];
            }
            nums[0] = last;
        }
    }
}
