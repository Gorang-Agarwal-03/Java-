package Array;

import java.util.Scanner;

public class FindPair {

     public static int find_Pair(int arr[],int target){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    count++;
                }
            }
        }
        return count;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre the Array length Here: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Entre" +n+" Element here :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Entre the target sum here:");
        int target = sc.nextInt();

        System.out.println("Number of pairs in array is:");
        System.out.println(find_Pair(arr,target));
    }
}
