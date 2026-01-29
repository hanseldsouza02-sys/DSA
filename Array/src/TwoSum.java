class Solution {
    public int[] twoSum(int[] nums, int target) {

        //BRUTE FORCE
        int n = nums.length;
        int[] ans = new int[2];
        for(int i = 0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i == j) continue ;
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;

        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<n;i++){
            m.put(nums[i],i);
        }
        for(int i =0;i<n;i++){
            int ele = target - nums[i];
            if(m.containsKey(ele)){
                int x = m.get(ele);
                if(x == i) continue;
                ans[0] = i;
                ans[1] = x;
            }
        }
        return ans;
    }
}