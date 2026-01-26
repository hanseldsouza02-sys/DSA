import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        //BRUTE FORCE SOLUTION

        int n = nums.length;
        int len = 0;
        for(int i =0;i<n;i++){
            for(int j = i;j<n;j++){
                int s = 0;
                for(int h = i;h<=j;h++){
                    s += nums[h];
                    if(s == k){
                        len = Math.max(len,j-i+1);
                    }
                }
            }
        }
        return len;

        //BETTER SOLUTION O(N^2)

        int n = nums.length;
        int len = 0;
        for(int i =0;i<n;i++){
            int s =0;
            for(int j = i;j<n;j++){
                s += nums[j];
                if(s == k){
                        len = Math.max(len,j-i+1);
                    }
                }
            }
        }
        return len;


    //optimal solution

    HashMap<Integer,Integer> map = new HashMap<>();
    int n = nums.length;
    int len = 0;
    int presum =0;
    int Mlen =0;
    presum = 0;
        for(int i=0;i<n;i++){
        presum +=nums[i];
        len =0;
        if(presum == k){
            len = i+1;
        }else if(map.containsKey(presum - k)){
            int idx = map.get(presum - k);
            len = i-idx;

        }

        if(Mlen<len){
            Mlen = len;
        }
        if(!map.containsKey(presum)){
            map.put(presum,i);
        }
    }

        return Mlen;


        //optimal solution (for +ve numb er only)

    int i = 0;
    int j =0;
    int len =0;
    int Mlen =0;
    int sum =0;
    while(i<n){
        sum += nums[i];
        while(sum > k && j<=i){
            sum -= nums[i];
            j++;
        }
        if(sum == k){
            Mlen = math.max(Mlen,i-j+1);
        }
        i++;
    }
}