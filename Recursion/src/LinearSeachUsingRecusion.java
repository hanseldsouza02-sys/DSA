public class LinearSeachUsingRecusion {
    public static boolean exists(int[] arr,int ele,int idx){
        if(arr.length == idx) return false;
        if(arr[idx] == ele) return true;
        return exists(arr,ele,idx+1);
    }
}
