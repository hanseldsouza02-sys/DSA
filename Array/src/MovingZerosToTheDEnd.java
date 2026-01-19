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

        //Bruit force solution
//        int n = nums.length;
//        int[] temp = new int[n];
//        int j =0;
//        for(int i = 0;i<n;i++){
//            if(nums[i] != 0){
//                temp[j] = nums[i];
//                j++;
//            }
//        }
//
//        int m = temp.length;
//        int i =0;
//        while(i<n){
//            if(i<m){
//                nums[i] = temp[i];
//                i++;
//            }else{
//                nums[i] = 0;
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
