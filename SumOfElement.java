package com.matrixtask;

public class SumOfElement {
    public static int findSum(int N,int M,int[][] mat){
     int sum=0;
      for (int i=0;i<N;i++){
          for(int j=0;j<M;j++){
             sum+=mat[i][j];
          }
      }
      return sum;
    }
}
