import java.util.ArrayList;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arrpos = new int[n/2];
        int[] arrneg = new int[n/2];
        int h =0;
        int j =0;
        for(int i =0;i<n;i++){
            if(nums[i]>0){
                arrpos[h] = nums[i];
                h++;
            }else if(nums[i]<0){
                arrneg[j] = nums[i];
                j++;
            }
        }

        int m = arrpos.length;
        int q = arrneg.length;
        int i =0;
        j =0;
        int z = 0;
        while(i<n){
            if(i%2 == 0 && j<m){
                nums[i] = arrpos[j];
                j++;
            }else if(i%2 != 0 && z<q){
                nums[i] = arrneg[z];
                z++;
            }
            i++;
        }
        return nums;


        int n = nums.length;
        int[] ans = new int[n];
        int pos =0;
        int neg = 1;
        for(int i =0;i<n;i++){
            if(nums[i]>0 && pos<n){
                ans[pos] = nums[i];
                pos += 2;
            }else if(nums[i]<0 && neg<n){
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;

        // Slight variation of the problem

        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i =0;i<n;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else if(nums[i]<0){
                neg.add(nums[i]);
            }
        }

        int m = pos.size();
        int w = neg.size();

        int i =0;
        int j =0;
        int k =0;

        while(i<m && j<w){
            if(k%2 ==0){
                nums[k] = pos.get(i);
                i++;
            } else if(k%2 != 0) {
                nums[k] = neg.get(j);
                j++;
            }
            k++;
        }
        while(i<m){
            nums[k] = pos.get(i);
            i++;
            k++;
        }

        while(j<w){
            nums[k] = neg.get(j);
            j++;
            k++;
        }


    }
}
