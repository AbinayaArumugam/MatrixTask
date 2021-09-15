package com.matrixtask;

public class SuperSimilar {
    public static int findSuperSimilar(int row, int col, int[][] mat, int rotate) {
        int[][] newMat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                newMat[i][j] = mat[i][j];
            }
        }
        for(int i=0;i<row;i++){
            if(i%2==0){
                for(int k=0;k<rotate;k++){
                    int temp=newMat[i][0];
                    for(int j=0;j<col-1;j++){
                        newMat[i][j]=newMat[i][j+1];
                    }
                    newMat[i][col-1]=temp;
                }
            } else {
                for(int k=0;k<rotate;k++){
                    int temp=newMat[i][col-1];
                    for(int j=col-1;j>0;j--){
                        newMat[i][j]=newMat[i][j-1];
                    }
                    newMat[i][0]=temp;
                }
            }
        }for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(newMat[i][j]!=mat[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
}
