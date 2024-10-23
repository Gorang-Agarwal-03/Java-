package Recursion;

import java.util.Scanner;

public class GCD {

    public static int gcdOf(int x , int y){
        while (x%y != 0) {
            int rem = x % y;
            x=y;
            y=rem;
            
        }
        return y;

    }
    /* *******************************BY USING EUCLID'S ALGO****************************************** */
    public static int Rgcd(int x , int y){
        if(y == 0){
            return x;
        }
        return Rgcd(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("by itration method");
        System.out.println(gcdOf(x, y));
        System.out.println("By using recursion");
        System.out.println(Rgcd(x, y));
    }
}
