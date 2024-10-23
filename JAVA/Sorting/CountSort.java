package Sorting;

public class CountSort {
     public static int findMax(int[] arr){ 
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }

       static void basicCountSort(int arr[]){
        //Finding max element from array
        int max=findMax(arr);   
        int[] count = new int[max+1]; 
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++] = i;
            }
        }

    }    

    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val +" ");
        }
        System.out.println();
    }

    static void countsort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
         int max=findMax(arr);   
        int[] count = new int[max+1]; 
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //Make prefixsum
        for(int i=1 ; i<count.length ; i++){
            count[i]+=count[i-1];
        } 
         // find the index of each element in the original array and put them in output array
         for(int i=n-1 ; i>=0 ; i--){
            int indx = count[arr[i]]-1;
            output[indx] = arr[i];
            count[arr[i]]--;
         }

         //Copy all element of output to array

         for(int i=0 ; i<n ; i++){
            arr[i]=output[i];

         }

    }

    public static void main(String[] args){
        int[] arr = {1,4,5,2,2,5};
        //basicCountSort(arr);
        countsort(arr);
        display(arr);
    }

}