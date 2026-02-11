class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        int r0 = 0;
        int r1 = n-1;
        int c0 = 0;
        int c1 = m-1;
        while(r0<=r1 && c0<=c1){
            for(int j = c0 ;j<=c1;j++){
                ans.add(mat[r0][j]);
            }
            r0++;
            for(int i = r0;i<=r1;i++){
                ans.add(mat[i][c1]);
            }
            c1--;
            if(r0<=r1){
                for(int j = c1 ;j>=c0;j--){
                    ans.add(mat[r1][j]);
                }
                r1--;
            }
            if(c0<=c1){
                for(int i = r1;i>=r0;i--){
                    ans.add(mat[i][c0]);
                }
                c0++;
            }
        }
        return ans;
    }
}
