class Solution {
    public void SetOne(int[] arr,int k){
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(i == k){
                arr[i] = 1;
            }
        }
    }

    public void SetRows(int[][] mat,int k){
        int m = mat[0].length;
        for(int i =0;i<m;i++){
            mat[k][i] = 0;
        }
    }

    public void SetCol(int[][] mat,int k){
        int n = mat.length;
        for(int j=0;j<n;j++){
            mat[j][k] = 0;
        }
    }

    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] col = new int[m];
        int[] row = new int[n];
        for(int i = 0;i<n;i++){
            row[i] = 0;
        }
        for(int i =0;i<m;i++){
            col[i] = 0;
        }

        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                if(mat[i][j] == 0){
                    SetOne(row,i);
                    SetOne(col,j);
                }
            }
        }

        for(int i =0;i<n;i++){
            if(row[i] == 1){
                SetRows(mat,i);
            }
        }

        for(int i = 0;i<m;i++){
            if(col[i] == 1){
                SetCol(mat,i);
            }
        }

        public void Zeroes(int[][] mat,int k,int q){
            int n = mat.length;
            int m = mat[0].length;
            for(int i =0;i<n;i++){
                mat[i][q] = 0;
            }
            for(int j = 0;j<m;j++){
                mat[k][j] = 0;
            }

        }
        public void setZeroes(int[][] mat) {
            int n = mat.length;
            int m = mat[0].length;
            int[][] cpy = new int[n][m];
            for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    cpy[i][j] = mat[i][j];
                }
            }

            for(int i =0;i<n;i++){
                for(int j = 0;j<m;j++){
                    if(cpy[i][j] == 0){
                        Zeroes(mat,i,j);
                    }
                }
            }


            //OPTIMAL SOLUTION
            int n = mat.length;
            int m = mat[0].length;
            boolean FirstRowZero = false;
            boolean FirstColZero = false;


            for(int i = 0;i< n;i++){
                if(mat[i][0] == 0 ){
                    FirstColZero = true;
                    break;
                }
            }

            for(int j = 0;j< m;j++){
                if(mat[0][j] == 0 ){
                    FirstRowZero = true;
                    break;
                }
            }


            for(int i = 1; i< n;i++){
                for(int j = 1;j<m;j++){
                    if(mat[i][j] == 0){
                        mat[0][j] = 0;
                        mat[i][0] = 0;
                    }
                }
            }


            for(int i =1;i<n;i++){
                if(mat[i][0] == 0){
                    for(int j= 1;j<m;j++){
                        mat[i][j] = 0;
                    }
                }
            }

            for(int j = 1;j<m;j++){
                if(mat[0][j] == 0){
                    for(int i =1;i<n;i++){
                        mat[i][j] = 0;
                    }
                }
            }

            if(FirstRowZero == true){
                for(int j =0;j<m;j++){
                    mat[0][j] = 0;
                }
            }

            if(FirstColZero == true){
                for(int i =0;i<n;i++){
                    mat[i][0] = 0;
                }
            }



        }
}