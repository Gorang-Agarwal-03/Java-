package Array;

import java.util.Scanner;

public class prefixSum {

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
    
    /**************************************FIRST METHOD*********************************************/
    public static int[] sumArray(int arr[]){
        int n = arr.length;
        int prif[] = new int[n];

        prif[0] = arr[0];

        for(int i=1;i<n;i++){
            prif[i] = prif[i-1]+arr[i];
        }
        return prif;

    }

    /*************************************SECOND METHOD***********************************************/
    public static int[] prifixsum(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;


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
        System.out.println("Sorted Array:");
        printArray(prifixsum(arr));

    }
}
