import java.util.ArrayList;
import java.util.Scanner;

public class PrefixSumImplementation {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = arr.length;
        int s = 0;
        int[] pre = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i]  = pre[i-1] + arr[i];
        }

        System.out.println("what is the value of :");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int ans = 0;
        while (q != 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l ==0) {
                ans = pre[r];
            }
            else{
                ans = pre[r] - pre[l - 1];
            }
            q--;
        }
        return ans;
    }
}
