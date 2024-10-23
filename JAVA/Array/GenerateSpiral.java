package Array;

import java.util.Scanner;

public class GenerateSpiral {
    static void PrintMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    static int[][] Spiral(int n){
        int matrix[][] = new int[n][n];
        int topRow = 0;int bottomRow = n-1; int rightColumn=n-1;int leftColumn = 0;
        int curr = 1;

        while(curr <= n*n){
            // Top Row -> left to right column
            for(int j=leftColumn;j<=rightColumn && curr <n*n;j++){
                matrix[topRow][j] = curr;
                curr++;
            }
            topRow++;

            // Right column -> top to bottom Row
            for(int j=topRow;j<=bottomRow && curr<n*n;j++){
                matrix[j][rightColumn] = curr;
                curr++;
            }
            rightColumn--;

            //BottomRow -> right to left columns 
            for(int j=rightColumn;j>=leftColumn && curr<n*n;j--){
                matrix[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--;
            

            // left column -> bottom to top Row
            for(int j=bottomRow;j>=topRow && curr<n*n;j--){
                matrix[j][leftColumn] = curr;
                curr++;
            }
            leftColumn++;

        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre n");
        int n = sc.nextInt();
        int matrix[][] = Spiral(n);
        System.out.println(matrix);
    }
}
