package Array;

import java.util.Scanner;

public class presumofGivenange {
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
        int Sum[]=prifixsum(arr);

        System.out.println("Entre number of queries:");
        int q = sc.nextInt();

        while(q--> 0){
            System.out.println("Entre the ranges:");
            int l = sc.nextInt();
            int r=sc.nextInt();

            int ans = Sum[r]-Sum[l-1];

            System.out.println("Sum is --> "+ans);
        }
        

    }
}
