import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0;i<n-3;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j =i+1;j<n-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if((int)sum == target && sum > Integer.MIN_VALUE && sum < Integer.MAX_VALUE){
                        List<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        a.add(nums[l]);
                        Collections.sort(a);
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        while(k<l && nums[k+1] == nums[k]) k++;
                        while(k<l && nums[l-1] == nums[l]) l--;
                        k++;
                        l--;
                    }else if((int)sum < target) k++;
                    else l--;
                }
            }
        }

        return ans;


    }
}