package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UnionTwoArrat {
     public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
       HashSet<Integer>s = new HashSet<>() ;
       ArrayList<Integer>union = new ArrayList<>();

       for(int i=0;i<n;i++){
        s.add(arr1[i]);
       }
       for(int j=0;j<m;j++){
        s.add(arr2[j]);
       }
       for(int x :s){
        union.add(x);
       }
       Collections.sort(union);
       return union;
    }


    public static void main(String[] args) {
        int arr1[] = {-3,-5,-7};
        int arr2[] = {0,4,6,-7,-3,-1};
        int n = arr1.length;
        int m = arr2.length;
        System.out.println(findUnion(arr1, arr2, n, m));
    }
    
}
