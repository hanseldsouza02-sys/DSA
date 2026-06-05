import java.util.*;

public class PowerSet {
   public static  void powerset(String ans,String s,int idx){
       if(s.length() == idx){
           System.out.print(ans+" ");
           return;
       }
       char ch = s.charAt(idx);
       powerset(ans,s,idx+1);
       powerset(ans+ch,s,idx+1);


   }

    public static void main(String[] args) {
        String s = "abc";
        powerset("",s,0);

    }
}
