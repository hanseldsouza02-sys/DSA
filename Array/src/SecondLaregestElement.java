import java.util.Arrays;

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        //bruit force
        Arrays.sort(arr);
        int n = arr.length;
        int larg = arr[n-1];
        int secd = -1;
        for(int i =n-2;i>=0;i--){
            if( larg != secd){
                secd= arr[i];
                return secd;
            }
        }


        //1 optimized approach
         int lrg = Integer.MIN_VALUE;
         int scd = -1;
         for(int i = 0;i<n;i++){
             if(lrg < arr[i]){
                 lrg = arr[i];
             }
         }
        for(int j = 0 ;j<n;j++){
            if(scd < arr[j] && arr[j] != lrg){
                scd = arr[j];
            }
        }

        // 2nd optimal solution

        for(int i =0;i<n;i++){
            if(lrg < arr[i] ){
                scd = lrg;
                lrg = arr[i];
            }else if(scd < arr[i]){
                scd = arr[i];
            }
        }


    }
}
