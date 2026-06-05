public class ReverseAnArray {
    public void printArray(int[] arr,int idx){
        if(idx == arr.length) return ;
        System.out.println(arr[idx]);
        printArray(arr,idx+1);
    }

    public void printRevereseArray(int[] arr,int idx){
        if(idx == arr.length) return ;
        printArray(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
