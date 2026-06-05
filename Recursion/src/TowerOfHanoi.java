public class TowerOfHanoi {
    public static void main(String[] args) {
            hanoi(5,'A','B','C');
    }
    private static void hanoi(int n ,char a, char b, char c){
        if(n == 0) return ;
        hanoi(n-1,a,c,b);
        System.out.print(a+"->"+b);
        hanoi(n-1,b,a,c);
    }
}
