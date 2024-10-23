package Recursion;

public class SubsetSum {
    public static void subSum(int a[] , int n,int indx , int Sum){
        if(indx>=n){
            System.out.println(Sum);
            return;
        }

        // curr indx + sum
        subSum(a, n, indx+1, Sum +a[indx]);

        // curr ans
        subSum(a, n, indx+1, Sum);

    }
    public static void main(String[] args) {
        int a[] = {2,4,5};
        subSum(a, a.length, 0, 0);
        
    }
}
