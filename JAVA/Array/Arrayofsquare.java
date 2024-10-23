package Array;

import java.util.Scanner;

public class Arrayofsquare {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void swap(int arr[], int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
    public static void reverse(int arr[]){
        int st =0,end=arr.length-1;
        while(st < end){
            swap(arr,st,end);
            st++;
            end--;

        }
    }

    public static int[] sortSquare(int arr[]){
        int n = arr.length;
        int left =0,right = n-1;
        int ans[] = new int[n];
        int k =0;

        while (left<=right) {
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++] = arr[left]*arr[left];
                left++;
            }
            else{
                ans[k++]= arr[right]*arr[right];
                right--;
            }
            
        }
        return ans;
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

       int Arr[]= sortSquare(arr);
       System.out.println("Sorted Array:");
       reverse(Arr);
       printArray(Arr);

   } 
}
