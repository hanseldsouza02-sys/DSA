import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j =0;
        int[] ans = new int[n+m];
        int z = 0;
        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                if(z == 0 || ans[z - 1] != nums1[i] ){
                    ans[z] = nums1[i];
                    z++;
                }
                i++;
                j++;
            }
        }
        return Arrays.copyOf(ans, z);


    }
}