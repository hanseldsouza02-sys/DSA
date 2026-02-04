class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
            if(map.get(ele) > n/2){
                return ele;
            }
        }
        return -1;

        int n = nums.length;
        for(int i =0;i<n;i++){
            int x = nums[i];
            int count = 0;
            for(int j = 0;j<n;j++){
                if(x == nums[j]){
                    count++;
                }
            }
            if(count > n/2){
                return x;
            }
        }
        return -1;


// USING MOORES VOTING ALGORITHUM
        int n = nums.length;
        int ele = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            if(count == 0){
                ele = nums[i];
                count = 1;
            }else if(ele == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i =0;i<n;i++){
            if(nums[i] == ele){
                count++;
            }
            if(count>n/2){
                return ele;
            }
        }
        return -1;
    }
}
