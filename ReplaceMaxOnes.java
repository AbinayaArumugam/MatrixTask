package com.matrixtask;

public class ReplaceMaxOnes {
    public static int replaceMaxOnes(int row,int col,int[][] mat){
        int max=0;
        int maxIndex=0;
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>max){
                maxIndex=i;
                max=count;
            }
        }
        return maxIndex;
    }
}
