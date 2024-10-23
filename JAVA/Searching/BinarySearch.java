package Searching;

public class BinarySearch{
    static boolean binarysearch(int arr[] , int target){
        int n=arr.length;
        int st = 0;
        int lst = n-1;

        while(st<=lst){
            int mid = (st+lst)/2;
            if(target == arr[mid]){
                return true;
            } 
            else if(target< arr[mid]){
                lst= mid-1;
            }
            else{
                st = mid+1;
            }

        }
        return false;

    }

    // by use of recursion 
    static boolean recBinarySearch(int[] arr ,int st , int end , int target){
        if(st <= end){            
            int mid = (st+end)/2;
            if(target == arr[mid]){
                return true;
            }
            else if(target <arr[mid]){
                return recBinarySearch(arr , st , mid-1 , target);
            }
            else{
                return recBinarySearch(arr , mid+1 , end , target);
            }
        }
        return false;
        }

    public static void main(String[] args){
        int[]arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8};
        int target = 0;
        while(target != 10){
        System.out.printf("%d exist in array: %b \n",target, binarysearch(arr,target));
        System.out.printf("%d exist in array: %b \n",target, recBinarySearch(arr,0,arr.length-1,target));
        System.out.println();
        target++;

        }
    }

}