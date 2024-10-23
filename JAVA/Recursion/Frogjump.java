package Recursion;

public class Frogjump {
    public static int Best(int h[],int n , int indx){
        if(indx==n-1){
            return 0;
        }

        int ops1 = Math.abs(h[indx]- h[indx+1]) + Best(h, n, indx+1);
        if(indx == n-2){
            return ops1;
        }

        int ops2 = Math.abs(h[indx]- h[indx+2]) + Best(h, n, indx+2);

        return Math.min(ops1, ops2);
    }
    public static void main(String[] args) {
        int h[] = {10,30,40,20};
        System.out.println(Best(h, h.length, 0));
    }
}
