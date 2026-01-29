class Solution {

    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int j =0;j<n;j++){
            sum += arr[j];
        }
        int Lsum = 0;
        int rem = 0;
        for(int i =0;i<n;i++){
            if(i ==0){
                Lsum = 0;
            }else{
                Lsum += arr[i-1];
            }
            rem = sum - arr[i] - Lsum;
            if(rem == Lsum){
                return i;
            }
        }
        return -1;

        //Bruite force

        public static int sumArray(int i,int j,int[] arr){
            int sum =0;
            for(int h = i;h<j;h++){
                sum += arr[h];
            }
            return sum;
        }
        public static int findEquilibrium(int arr[]) {
            // code here
            int n = arr.length;
            int sum0 = 0;
            int sum1 = 0;

            for(int i =0;i<n;i++){
                sum0 = sumArray(0,i,arr);
                sum1 = sumArray(i+1,n,arr);
                if(sum0 == sum1){
                    return i;
                }
            }
            return -1;

    }
}


