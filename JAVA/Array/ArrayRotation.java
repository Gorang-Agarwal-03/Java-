package Array;

import java.util.Scanner;

public class ArrayRotation {
    static void PrintMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void TransposeInPlace(int [][]matrix,int r,int c){

        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
    static void ReverseArray(int []arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    static void rotate(int [][]matrix,int n){
        //Step 1 = Transpose matrix
        TransposeInPlace(matrix, n, n);

        // Step2 = Reverse each row of  the transpose matrix
        for(int i=0;i<n;i++){
            ReverseArray(matrix[i]);
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre number of rows and colums of array:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] a = new int [r][c];
        int totalElement = r*c;
        System.out.println("Entre "+totalElement+ " values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix :");
        PrintMatrix(a);

        System.out.println("After Rotation Matrix is:");
        rotate(a,r);
        PrintMatrix(a);
       // int [][] ans= Transpose(a, r, c);
        //PrintMatrix(ans);
    }
}
