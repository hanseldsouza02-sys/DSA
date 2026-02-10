// User function Template for Java
class GFG {
    static void transpose(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(i<j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }else{
                    continue;
                }
            }
        }
    }
    static void rotate(int mat[][]) {

        int n = mat.length;
        int m = mat.length;
        transpose(mat);
        for(int i =0;i<n;i++){
            for(int j =0;j<m/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][m-j-1];
                mat[i][m-j-1] = temp;
            }
        }

        //BRUTE FORCE
        int n = mat.length;
        int m = mat.length;
        int[][] extra = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                extra[i][j] = mat[i][j];
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                mat[j][m-i-1] = extra[i][j];
            }
        }


    }
}