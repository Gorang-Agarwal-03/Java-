package Sorting;

public class RedixSort{
     public static int findMax(int[] arr){ 
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void countsort(int[] arr,int place){
        int n = arr.length;
        int[] output = new int[n];
         int max=findMax(arr);   
        int[] count = new int[10]; 
        for(int i=0;i<arr.length;i++){
            count[( arr[i]/place ) % 10]++;
        }

        //Make prefixsum
        for(int i=1 ; i<count.length ; i++){
            count[i]+=count[i-1];
        } 

         // find the index of each element in the original array and put them in output array
         for(int i=n-1 ; i>=0 ; i--){
            int indx = count[( arr[i]/place ) %10]-1;
            output[indx] = arr[i];
            count[( arr[i]/place ) %10]--;
        }

         //Copy all element of output to array
         for(int i=0 ; i<n ; i++){
            arr[i]=output[i];
        }
    }
    static void redixsort(int arr[]){
        int max = findMax(arr);

        // Apply counting sort to sort element based on there place value
        for(int place=1 ; max/place>0 ; place*=10){
            countsort(arr , place);
        } 

    }
    public static void main(String[] args){
        int[] arr = {43 , 433 , 864 , 194 , 100 , 3};
        redixsort(arr);
        for(int val:arr){
            System.out.print(val+"  ");
        }
        System.out.println();

    }
}