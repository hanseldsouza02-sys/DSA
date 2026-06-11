public class Nqueen {
    public static void main(String[] args) {
        int n = 4;
        char[][] a = new char[n][n];

        for(int i =0;i<n;i++){
            for( int j = 0;j<n;j++){
                a[i][j] = 'X';
            }
        }
        queen(a,0);

    }

    public static void queen(char[][] a,int row){
        int n = a.length;
        if(row == n){
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    System. out.print(a[i][j] +" ");
                }
                System.out.println();
            }
            System. out.println();
            return ;
        }
        for(int i=0;i<n;i++){
            if(check( a, row, i)){
                a[row][i] = 'Q';
                queen(a,row+1);
                a[row][i] = 'X';

            }
        }

    }

    public static boolean check(char[][] a,int row,int col){
        int n = a.length;
        int i =row-1;
        while(i >= 0){
            if(a[i][col] == 'Q') return false;
            i--;
        }

        i = row-1;
        int j = col -1;
        while(i >= 0 && j >= 0){
            if(a[i][j] == 'Q') return false;
            i--;
            j--;
        }

        i = row -1;
        j = col +1;
        while(i >= 0 &&  j < n){
            if(a[i][j] == 'Q') return false;
            i--;
            j++;
        }

        return true;

    }
    
}
