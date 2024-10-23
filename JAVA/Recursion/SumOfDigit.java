package Recursion;

public class SumOfDigit {
    public static int sod(int n){
        //BASE CASE
        if(n>=0 && n<=9){
            return n;
        }
        //RECURSIVE WORK
        return sod(n/10)+(n%10);



    }
    public static void main(String[] args) {
        System.out.println(sod(1234));
    }
    
}
