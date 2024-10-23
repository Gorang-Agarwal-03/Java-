package Recursion;

import java.util.Scanner;

public class ReverseString {
    static String reverse(String s , int indx){
        if(indx==s.length()){
            return " ";
        }
        String smallans = reverse(s, indx+1);
        return smallans + s.charAt(indx);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.err.println(reverse(s,0));

        
    }
}