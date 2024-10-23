package Recursion;

public class powerofnumber {
    /* ***********************************FIRST METHOD ******************************************* */
//O(q)
    public static int pow(int p , int q){
        if(q==p){
            return 1;
        }
        return pow(p,q-1) * p;
    }

    /* **********************************SECOND METHOD ******************************************** */
    //O(log q)
    public static int pw(int p , int q){
        if(q==p){
            return 1;
        }
        int smallPow = pw(p,q/2);

        if(q % 2 ==0){
            return smallPow * smallPow;
        }
        else{
            return p * smallPow * smallPow;
        }

    }
    
    public static void main(String[] args) {
        System.out.println(pow(4,6));
        System.out.println(pw(2,6));
    }
}
