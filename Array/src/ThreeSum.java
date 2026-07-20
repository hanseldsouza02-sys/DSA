import java.util.*;

class Solution {
    //OPTIMAL
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n -1 ;
            while(j<k){
                int rem = nums[i]+nums[j]+nums[k];
                if(rem<0){
                    j++;
                }else if(rem == 0){
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    ans.add(a);
                    while(j<k && nums[j] == nums[j+1]) j++;
                    while(j<k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }else{
                    k--;
                }
            }
        }
        return ans;
    }

    //better

    public List<List<Integer>> threeSumBetter(int[] nums) {

        HashSet<List<Integer>> seen = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for(int i = 0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int rem = -(nums[i]+nums[j]);
                if(set.contains(rem)){
                    List<Integer> s = new ArrayList<>();
                    s.add(nums[i]);
                    s.add(nums[j]);
                    s.add(rem);
                    Collections.sort(s);
                    if(seen.add(s)){
                        ans.add(s);
                    }
                }
                set.add(nums[j]);
            }
        }
        return ans;
    }
}
