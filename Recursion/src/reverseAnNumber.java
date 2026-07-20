import java.util.ArrayList;

public class reverseAnNumber {
    static ArrayList<Integer> ans = new ArrayList<>();
    static void  reverse(int n){

        if(n == 0){
            return;
        }
        ans.add(n%10);
        reverse(n/10);
    }
    public static void main(String[] args) {
        int n = 5;
        reverse(n);
    }
}
