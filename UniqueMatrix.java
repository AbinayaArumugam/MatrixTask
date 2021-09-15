package com.matrixtask;

public class UniqueMatrix {
    public static void uniqueMat(int row,int col,int[][] mat){
        for(int i=0;i<row;i++){
            int flag=0;
            for(int j=0;j<i;j++) {
                flag = 1;
                for (int k = 0; k < col; k++) {
                    if (mat[i][k] != mat[j][k]) {
                        flag = 0;
                    }
                }
                    if (flag == 1) {
                        break;
                    }

            }
                if(flag==0){
                    for(int j=0;j<col;j++){
                        System.out.print(mat[i][j]);
                    }
                    System.out.println();
                }

        }
    }
}
