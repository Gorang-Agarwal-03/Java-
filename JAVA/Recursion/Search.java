package Recursion;

import java.util.Scanner;

public class Search {
    public static boolean search(int arr[],int target , int indx){
        if(indx>=arr.length){
            return false;
        }
        if(arr[indx]==target){
            return true;
        }
        return search(arr, target, indx+1);
    }

    public static void findIndex(int arr[],int target , int indx){

        if(indx>=arr.length){
            return;
        }
        if(arr[indx] == target){
            System.out.print(indx +" ");
        }
        findIndex(arr, target, indx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number you want to search in array frm 0-9:");
        int t = sc.nextInt(); 
        int arr[] = {2,5,6,1,4,3,7,9,3,6,1,6,34,5,2,7,9,5,7,4,7,6,8,5,3,2,6,4,2,4};
        int target = t;
        if(search(arr, target, 0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        findIndex(arr, target, 0);
        
    }
}
