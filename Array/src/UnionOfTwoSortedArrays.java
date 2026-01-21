import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> set = new Set<>();
        ArrayList<Integer> list = new ArrayList<>();
        int i =0;
        int j =0;
        int n = a.length;
        int m = b.length;
        while(i<n){
            if(!set.contains(a[i])){
                set.add(a[i]);
                i++;
            }else {
                i++;
            }
        }

        while(j<m){
            if(!set.contains(b[j])){
                set.add(b[j]);
                j++;
            }else {
                j++;
            }
        }

       for(int ele : set){
           list.add(ele);
       }
        return list;


       //OPTIMAL SOLUTION
        int n = a.length;
        int m = b.length;
        int i =0;
        int j =0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i<n && j<m){

            if(a[i]<=b[j]){
                if(union.size() == 0 || union.get(union.size()-1) != a[i])
                    union.add(a[i]);
                i++;
            }
            else{
                if(union.size() == 0 || union.get(union.size()-1) != b[j])
                    union.add(b[j]);
                j++;
            }
        }

        while(i<n){
            if(union.get(union.size() - 1) != a[i])
                union.add(a[i]);
            i++;
        }

        while(j<m){
            if(union.get(union.size() - 1) != b[j])
                union.add(b[j]);
            j++;

        }
        return union;

    }
}