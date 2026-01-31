
class Solution {

    public static void update(int a[], int n, int updates[], int k) {
        // Your code goes here
        //BRUTE FORCE

        for(int j = 0;j<k;j++){
            int ele = updates[j] -1;
            for(int i=ele;i<n;i++){
                a[i]++;
            }
        }
    }
}

