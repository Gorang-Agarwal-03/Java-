package Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static ArrayList<String>getSSQ(String s){
        ArrayList<String>ans = new ArrayList<>();

        //Base Case
        if(s.length()==0){
            ans.add(" ");
            return ans;
        }


        char curr = s.charAt(0);
        ArrayList<String>smallans = getSSQ(s.substring(1));

        for(String ss :smallans){
            ans.add(ss);
            ans.add(curr+ss);
        
        }
        return ans;
        


    }
    public static void main(String[] args) {
        ArrayList<String>ans = getSSQ("abcd");
        for(String ss :ans){
            System.out.println(ss);
        }
        
    }
}
