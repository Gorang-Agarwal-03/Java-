package Array;

public class StrictlyLargest {
     public static void main(String[] args) {
        int arr[] = {1,4,6,4,8,3,5,4,2,7,5,4,2};
        int ele=0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>ele){
                ele=arr[i];
            }

        }
        System.out.println(ele);
    }
}
