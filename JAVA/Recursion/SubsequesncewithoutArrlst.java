package Recursion;

public class SubsequesncewithoutArrlst {
    public static void printSSQ(String s , String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remstr = s.substring(1);

        // Curr char -> chosse to be a part of currAns

        printSSQ(remstr, currAns + curr);


        // Curr char -> choose to not be a part of currAns

        printSSQ(remstr, currAns);
    }
    public static void main(String[] args) {
        printSSQ("abc", " ");
        
    }
}
