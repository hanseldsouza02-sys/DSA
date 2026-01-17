class Solution {
    public void rotate(int[] arr) {
        // code here
        //BRUTE FORCE SOLUTION
        int n = arr.length;
        int[] temp = new int[n];
        for(int i = 1;i<n;i++){
            temp[i-1] = arr[i];
        }
        temp[n-1] = arr[0];
        for(int i =0;i<n;i++){
            arr[i] = temp[i];
        }

//        int n = arr.length;
//        int first = arr[0];
//        for(int i =0;i<n-1;i++){
//            int temp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
//        arr[n-1]= first;
    }
}