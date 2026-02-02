class Solution {
    public void swap(int[] nums,int pos1, int pos2){
        int temp;
        temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;

    }
    // DUTCH FLAG ALGO
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;

            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,high,mid);
                high--;
            }
        }
        // BETTER
        int n = nums.length;
        int count0 =0;
        int count1 = 0;
        int count2 = 0;
        for(int i =0;i< n;i++){
            if(nums[i] == 0){
                count0++;
            }else if(nums[i] == 1){
                count1++;
            }else{
                count2++;
            }
        }
        for(int i = 0;i<count0 ;i++){
            nums[i] = 0;
        }
        for(int i = count0 ;i<count0+count1;i++){
            nums[i] = 1;
        }
        for(int i = count0+count1;i<count0+count1+count2;i++){
            nums[i] = 2;
        }

    }

}