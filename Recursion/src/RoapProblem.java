public class RoapProblem {
    public static  int res;
    public static int function1(int n,int a, int b,int c){
        if(res < 0) return -1;
        if(res ==0 ) return 0;

        res = Math.max(function1(n-a,a,b,c),Math.max(function1(n-b,a,b,c),function1(n-c,a,b,c)));

        if(res == -1) return -1;
        else return res +1;

    }
}
