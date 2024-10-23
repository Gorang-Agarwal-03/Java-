package Array;

import java.util.Scanner;

public class CountElement {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int arr[] = {1,4,6,4,8,3,5,4,2,7,5,4,2};
        System.out.println("Entre the number here: ");
        int x = sc.nextInt();
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }

        }
        System.out.println(count);
    }
}
