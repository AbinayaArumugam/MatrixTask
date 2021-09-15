package com.matrixtask;

public class ReplaceWithZeros {
    public static int[][] replaceWithZeros(int R,int C,int[][] mat){
        int row[]=new int[R];
        int[] col=new int[C];
        for(int i=0;i<R;i++){
            row[i]=1;
        }
        for(int j=0;j<C;j++){
            col[j]=1;
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++) {
                if(mat[i][j]==0){
                 row[i]=0;
                 col[j]=0;
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(row[i]==0||col[j]==0){
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }
}
