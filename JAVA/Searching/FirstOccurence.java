package Searching;

public class FirstOccurence{
     static int firstaccre(int arr[] , int x){
        int n=arr.length;
        int st = 0;
        int end = n-1;
        int fo = -1;

        while(st<=end){
            int mid = (st+end)/2;
            if(x == arr[mid]){
                fo=mid;
                end = mid-1;
            } 
            else if(x < arr[mid]){
                end= mid-1;
            }
            else{
                st = mid+1;
            }

        }
         return fo;


    }
    public static void main(String[] args){
        int[] a= {1,5,5,5,6,7,3};
        int x = 5;
        int ans = firstaccre( a , x);
        System.out.println(ans);
        }
}