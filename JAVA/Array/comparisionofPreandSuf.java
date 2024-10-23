package Array;

import java.util.Scanner;

public class comparisionofPreandSuf {
    static int arraySum(int arr[]){
        int totalSum = 0;
        for(int i=0;i<arr.length;i++){
            totalSum +=arr[i];
        }
        return totalSum;

    }

    public static boolean equalSum(int arr[]){
        int totalsum = arraySum(arr);

        int presum =0;
        for(int i=0;i<arr.length;i++){
            presum +=arr[i];
            int suffixsum = totalsum - presum;
        
        if(suffixsum == presum){
            return true;
        }
    }
    return false;
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

            System.out.println("Equal Partition Possible == "+equalSum(arr));        

    }
}
