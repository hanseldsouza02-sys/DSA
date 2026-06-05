class Solution {

    //BRUTE FORCE SOLUTION
    public List<Integer> majorityElement(int[] nums) {
        HashSet<Integer> S = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        if(n<=2){
            for(int i =0;i<n;i++){
                if(!S.contains(nums[i])){
                    ans.add(nums[i]);
                }
                S.add(nums[i]);
            }
            return ans;
        }
        for(int i =0;i<n;i++){
            int key = nums[i];
            if(S.contains(key)){
                continue;
            }else{
                int count = 0;
                for(int j = 0 ;j<n;j++){
                    if(nums[j] == key){
                        count++;
                    }

                }
                if(count > n/3){
                    ans.add(key);
                }
                S.add(key);
            }
        }

        return ans;
    }
}