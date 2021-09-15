package com.matrixtask;

public class MatrixRotate
{
    public static int[][] rotateAntiClock(int N,int[][] mat){
        for(int i=0;i<N/2;i++){
            for(int j=i;j<N-i-1;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][N-1-i];
                mat[j][N-1-i]=mat[N-1-i][N-1-j];
                mat[N-1-i][N-1-j]=mat[N-1-j][i];
                mat[N-1-j][i]=temp;
            }
        }

        return mat;
    }
}
