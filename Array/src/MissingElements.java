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


        //OPTIMAL SOLUTION
        int n = nums.length;
        int Asum =0;
        for(int i =0;i<n;i++){
            Asum += nums[i];
        }

        int sum = (n*(n+1))/2;

        return sum - Asum;

    }
}
