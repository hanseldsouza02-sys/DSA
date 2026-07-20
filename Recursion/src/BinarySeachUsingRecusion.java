public class BinarySeachUsingRecusion {
    public static int found(int[] arr,int lo,int hi,int ele){
        if(lo>hi) return -1;
        int mid =(lo + hi)/2;
        if(arr[mid] == ele) return mid;
        else if(arr[mid] > ele) return found(arr,lo,mid-1,ele);
        else return found(arr,mid+1,hi,ele);

    }
}
