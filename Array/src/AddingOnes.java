
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

        //opimal solution
        for(int i =0;i<k;i++){
            int x = updates[i] -1;
            a[x]++;
        }
        int sum =0;
        for(int j =0;j<n;j++){
            if(j ==0){
                sum = a[j];
            }else{
                sum += a[j];
            }
            a[j] = sum;
        }

    }
}

