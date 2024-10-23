package Array;

import java.util.Scanner;

public class Firstrepeatingval {

    public static int repeteNum(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
            return -1;
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

        System.out.println("Second max element in array is:");
        System.out.println(repeteNum(arr));
        }
}
