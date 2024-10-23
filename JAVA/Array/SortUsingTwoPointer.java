package Array;

import java.util.Scanner;

public class SortUsingTwoPointer {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // **********************************FIRST APPROACH************************************* 
     public static void sortArray(int arr[]){
        int zeroes =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }

        for(int j=0;j<arr.length;j++){
            if(j<zeroes){
                arr[j] = 0;
            }
            else{
                arr[j] = 1;
            }
        }
    }

    // **********************************SECOND APPROACH ********************************************
    public static void arraySort(int arr[]){
        int n =arr.length;

        int left=0,right = n-1;

        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }

        }


    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Entre the Array length Here: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Entre " +n+" Element here :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("original Array:");
        printArray(arr);
        arraySort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);

    }
}
