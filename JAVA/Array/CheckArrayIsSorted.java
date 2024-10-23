package Array;

public class CheckArrayIsSorted {
    public static boolean checkArray(int arr[]){
        boolean Check = true;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                Check = false;
                break;
            }
        }
        return Check;

    }
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,7,4,6,8,3,5,7,5,65,63,6,3};
        checkArray(arr);
        
    }
}
