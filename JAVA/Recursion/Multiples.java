package Recursion;

import java.util.Scanner;

public class Multiples {
    static void printMul(int n , int k){

        //Base case 
        if(k==1){
            System.out.print(n +" ");
            return;
        }
        // Recursive work
        printMul(n, k-1);

        //Self Work
        System.out.print(n*k +" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre th value of n");
        int n = sc.nextInt();
        System.out.println("Entre th value of k");
        int k = sc.nextInt();

        printMul(n, k);
        
    }
}
