package Searching;

public class Peak_index_in_MountedArray{
    public static  int peakindex(int arr[]){
        int st =0 , end = arr.length-1;
        int ans = -1 ;
        while(st <=end){
            int mid = st+(end-st)/2;

            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args){
        int arr[] = {2,3,16,8,7,3}; 
        System.out.println(peakindex(arr));
    } 
}