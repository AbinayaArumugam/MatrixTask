package com.matrixtask;

public class TransposeMatrix {
public static int[][] transpose(int N,int[][] mat){
    for(int i=0;i<N;i++){
        for(int j=i;j<N;j++){
            int temp =mat[j][i];
            mat[j][i]=mat[i][j];
            mat[i][j]=temp;
        }
    }
    return mat;
}
}
