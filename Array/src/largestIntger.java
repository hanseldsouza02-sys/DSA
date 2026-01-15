class Solution {
        public static int largest( int[] arr){
            // code here
            int n = arr.length;
            int larg = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > larg) {
                    larg = arr[i];
                }
            }
            return larg;
        }

}