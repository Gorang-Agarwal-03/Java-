package Recursion;

import java.util.Scanner;

public class RemoveAucrences {

    public static String removeA(String s,int indx){
        if(indx==s.length()){
            return "";
        }
        String ans = removeA(s, indx+1);


        char curr = s.charAt(indx);

        if(curr!='a'){
            return curr + ans;
        }
        else{
            return ans;
        }

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
    }
}
