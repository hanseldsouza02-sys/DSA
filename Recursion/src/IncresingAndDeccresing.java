public class IncresingAndDeccresing {
  public static   void incresing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        incresing(n-1);
    }

   public static void decreses(int n){
        if(n == 0){
            return;
        }
        decreses(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {

        int n = 5;
        incresing(n);
        decreses(n);

    }
}
