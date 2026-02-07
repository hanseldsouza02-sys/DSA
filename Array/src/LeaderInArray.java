import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code hererra
        //OPTIMAL SOLUTION
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i =n-1;i>=0;i--){
            if(max<=arr[i]){
                max = arr[i];
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;

        //Bruit Force
        int n = arr.length;
        boolean flag = false;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i =0;i<n-1;i++){
            int ele = arr[i];
            for(int j =i+1;j<n;j++){
                if(ele < arr[j]){
                    flag = false;
                    break;
                }else{
                    flag = true;
                }
            }
            if(flag == true){
                ans.add(ele);
            }
        }
        ans.add(arr[n-1]);
        return ans;
    }
}
