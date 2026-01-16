class Solution {
    public int removeDuplicates(int[] nums) {
        //BRUTE FORCE SOLUTION
//        int n = nums.length;
//        int count = 1;
//        for(int i =1;i<n;i++){
//           if(nums[i] != nums[i-1]){
//                nums[count] = nums[i];
//                count++;
//        }
//        return count;
//   }
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 1;
        while(i<n){
            if(nums[i] == nums[j]) {
                i++;
            }else if(nums[i] != nums[j]){
                nums[count] = nums[i];
                count++;
                j = i;
            }
        }

        return count;

    }
}
