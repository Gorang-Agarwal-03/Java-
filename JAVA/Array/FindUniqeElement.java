package Array;

import java.util.Scanner;

public class FindUniqeElement {
       public static int find_Uniq(int arr[]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        arr[i] = -1;
                        arr[j] = -1;
                    }
                }
            }
            int ans = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    ans = arr[i];
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

        System.out.println("Unique Number in array is:");
        System.out.println(find_Uniq(arr));
    }
}

