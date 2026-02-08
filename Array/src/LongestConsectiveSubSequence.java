import java.util.Arrays;

class Solution {
    public boolean Linear(int[] nums,int x){
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i] == x){
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {

        //BRUTE FORCE SOLUTION
        int n = nums.length;
        int Mcount = 0;
        for(int i = 0;i<n;i++){
            int x = nums[i];
            int count = 1;
            while(Linear(nums,x+1)){
                x +=1;
                count++;
            }
            Mcount = Math.max(Mcount,count);
        }
        return Mcount;

        //Better solution
        Arrays.sort(arr);
        int n = arr.length;
        int longest = 1;
        int count = 1;
        for(int i = 1;i<n;i++){
            if(arr[i] == arr[i-1]){
                continue;
            }else if(arr[i] == arr[i-1] + 1){
                count++;
            }else{
                count = 1;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}
