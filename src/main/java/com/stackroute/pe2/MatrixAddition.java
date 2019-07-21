package com.stackroute.pe2;

public class MatrixAddition {
    public int[][] addMatrix(int n,int m,int[][] matrix1,int[][] matrix2){

        int sum[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return sum;
    }
}
