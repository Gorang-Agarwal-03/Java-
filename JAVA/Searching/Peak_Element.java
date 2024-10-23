package Searching;

public class Peak_Element{
    public static int findPeakElement(int[]num){
         int n = num.length;
         int st = 0, end =n-1;
         while(st<=end){
            int mid = st + (end-st)/2;
            if(mid ==0 || num[mid]>num[mid+1] && (mid == n-1 || num[mid]>num[mid-1])){
                return mid;
            }
            if(num[mid] < num[mid+1]){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
         }
         return -1;

    }
    public static void main(String[] args){
        int a[] = {5,3,7,1,9,8};
        System.out.println(findPeakElement(a));

    }
}