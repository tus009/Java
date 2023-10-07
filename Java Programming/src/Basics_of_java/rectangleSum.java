package Basics_of_java;

import java.util.Scanner;
public class rectangleSum {
    static int findsum(int[][] Matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i=l1; i<=l2; i++){
            for (int j=r1; j<=r2; j++){
                sum += Matrix[i][j];
            }
        }
        return sum;
    }

    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i =0; i < r; i++){
            for (int j=1; j<c; j++){
                matrix[i][j] += matrix[i][j-1];

            }
        }
        for (int j=0; j<c; j++){
            for (int i =1; i < r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }

    }

    static int findsum2(int[][] Matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        findPrefixSumMatrix(Matrix);

        for (int i = l1; i <= l2; i++){
            if (r1 > 0){
                sum += Matrix[i][r2] - Matrix[i][r1-1];
            }
            else {
                sum += Matrix[i][r2];
            }
        }
        return sum;
    }

    static int findsum3(int[][] Matrix, int l1, int r1, int l2, int r2) {
        int sum = 0, ans =0 , up=0 , left = 0 , upleft = 0;
        findPrefixSumMatrix(Matrix);

        ans = sum - (up - left ) + (upleft);

        sum = Matrix[l2][r2];
        if(l1>=1) {
            up = Matrix[l1 - 1][r2];
        }
        if(r1>=1) {
            left = Matrix[l2][r1 - 1];
        }
        if(r1>=1 && (l1>=1)) {
            upleft = Matrix[l1 - 1][r1 - 1];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and column ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelements = r*c;
        System.out.println("enter" + totalelements + "elements") ;
        for (int i =0; i<r; i++){
            for (int j=0; j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter boundaries of rectangle l1, r1, l2, r2");

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("rectangle sum = "+ findsum(matrix , l1,  r1, l2, r2));
        System.out.println("rectangle sum = "+ findsum3(matrix , l1,  r1, l2, r2));



    }
}
