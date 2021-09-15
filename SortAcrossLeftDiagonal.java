package com.matrixtask;

import java.util.Arrays;

public class SortAcrossLeftDiagonal {
    public static int[][] sortDiagonal(int size,int[][] mat){
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=mat[i][i];
        }
        Arrays.sort(arr);
        for(int j=0;j<size;j++){
            mat[j][j]=arr[j];
        }
        return mat;
    }
}
