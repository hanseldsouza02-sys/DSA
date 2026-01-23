import java.util.HashSet;
import java.util.Set;

class Solution {
    int missingNum(int arr[]) {
        // code here
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i =1;i<=n+1;i++){
            set.add(i);
        }

        for(int i = 0;i<n;i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }
        }

        return set.iterator().next();

        //BRUTE FORCE
        int n = nums.length;
        int ans = 0;
        boolean flag;
        for(int i =0;i<=n;i++){
            flag = false;
            for(int j =0;j<n;j++){
                if(i == nums[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ans = i;
            }
        }
        return ans;

        int n = nums.length;
        int ans = 0;
        boolean flag;
        boolean[] check = new boolean[n+1];
        for(int i = 0 ;i<=n ;i++){
            check[i] = false;
        }
        for(int i =0;i<n;i++){
            check[nums[i]] = true;
        }

        for(int i =0;i<=n;i++){
            if(check[i] == false){
                ans = i;
            }
        }
        return ans;


        //OPTIMAL SOLUTION
        int n = nums.length;
        int Asum =0;
        for(int i =0;i<n;i++){
            Asum += nums[i];
        }

        int sum = (n*(n+1))/2;

        return sum - Asum;

        int n = nums.length;
        int ans1 = 0;
        int ans2 = 0;
        for(int i =0;i<=n;i++){
            ans1^=i;
        }
        for(int j =0;j<n;j++){
            ans2^=nums[j];
        }
        return ans1^ans2;
    }
    }
}
