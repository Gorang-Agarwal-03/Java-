package Array;

import java.util.Scanner;

public class EvenSorting {
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

    public static void arraySort(int arr[]){
        int n = arr.length;
        int left=0 , right=n-1;

        while(left<right){
            if(arr[left]%2 !=0 && arr[right]%2==0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2 !=0){
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
        System.out.println("Evenly Sorted Array:");
        printArray(arr);

    }
}
