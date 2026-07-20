import java.util.Arrays;

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        boolean flag = false;
        int n = arr.length;
        Arrays.sort(arr);

        for(int i =0;i<n;i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            int j =i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum<target){
                    j++;
                }else if(sum == target){
                    flag = true;
                    break;
                }else{
                    k--;
                }
            }
        }
        return flag;
    }
}
