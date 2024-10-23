package Array;

import java.util.Scanner;

public class FindSecondlargest {
    public static int findMax(int arr[]){
        int mx =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
            
        }
        return mx;
    }
        public static int SecondMax(int arr[]){
            int mx =findMax(arr);

            for(int i =0;i<arr.length;i++){
                if(arr[i]==mx){
                    arr[i] = Integer.MIN_VALUE;
                }

            }
            int secondmax = findMax(arr);

        
        return secondmax;
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

        System.out.println("Second largest element in array is:");
        System.out.println(SecondMax(arr));
        }
}
