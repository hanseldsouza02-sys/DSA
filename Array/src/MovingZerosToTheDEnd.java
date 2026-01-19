class Solution {
    public void moveZeroes(int[] nums) {
        //MOVES ZEROS TO THE END BUT DOS'T GIVE STABLE OUTPUT
//        Arrays.sort(nums);
//        int n = nums.length;
//        int i = 0;
//        int j = n-1;
//        while(i<j){
//            int temp;
//            if(nums[i] == 0){
//                temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                i++;
//                j--;
//            }else if(nums[i] != 0){
//                i++;
//            }
//        }
        int i =0;
        int j =0;
        int n = nums.length;
        while(i<n){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
}
