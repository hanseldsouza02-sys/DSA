import java.util.ArrayList;

public class SecondLargestSecondSmallest {
   public ArrayList<Integer> FindSecondLaragestSecondSmallest(int[] arr){
       int lrg = arr[0];
       int scdLrg = Integer.MIN_VALUE;
       int sml = arr[0];
       int scdSml = Integer.MAX_VALUE;
       int n = arr.length;
ArrayList<Integer> ans = new ArrayList<>();
       for(int i =0;i<n;i++){
           if(lrg < arr[i]){
               scdLrg = lrg;
               lrg = arr[i];
           } else if (scdLrg < arr[i] && scdLrg != lrg) {
               scdLrg = arr[i];
           }
           if(sml > arr[i]){
               scdSml = sml;
               sml = arr[i];
           }else if(scdSml > arr[i] && scdSml != sml){
               scdSml = arr[i];
           }
       }
    ans.add(scdLrg);
    ans.add(scdSml);

    return ans;
   }
}
