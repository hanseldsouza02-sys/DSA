import java.util.*;

class Solution {
    //BRYTE FORCE SOLUTION
    public int comd(int r,int c){
        long res = 1;
        for(int i =0;i<c;i++){
            res = res * (r - i);
            res = res / (i+1);
        }
        return (int)res;
    }
    public List<Integer> getRow(int r) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i =1;i<=r;i++){
            ans.add(comd(r,i));
        }
        return ans;
    }
}