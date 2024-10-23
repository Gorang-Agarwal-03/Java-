package Array;

public class RotateArray {
    public static  void reverse(int arr[] , int str , int end){
        while(str<end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;

            str++;
            end--;
        }
    }
    public static  void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        
        
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};   //  k=3
        for(int i=0;i<arr.length;i++){
            rotate(arr, 3);
        }
        }
}
