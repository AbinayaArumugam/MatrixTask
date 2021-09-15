package com.matrixtask;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the question no");
        int question = in.nextInt();
        switch (question) {
            case 1:
                System.out.println("Enter the no of rows");
                int row = in.nextInt();
                System.out.println("Enter the no of column ");
                int column = in.nextInt();
                System.out.println("Enter the Elements");
                int[][] matrix = new int[row][column];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        matrix[i][j] = in.nextInt();
                    }
                }
                System.out.println(SumOfElement.findSum(row,column,matrix));
                break;
            case 2:
                System.out.println("Enter the size of matrix");
                int size = in.nextInt();
                System.out.println("Enter the Elements");
                int[][] matrix2 = new int[size][size];
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        matrix2[i][j] = in.nextInt();
                    }
                }
                int[][] newMat= MatrixRotate.rotateAntiClock(size,matrix2);
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print(newMat[i][j]+" ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Enter the size of matrix");
                int size3 = in.nextInt();
                System.out.println("Enter the Elements");
                int[][] matrix3 = new int[size3][size3];
                for (int i = 0; i < size3; i++) {
                    for (int j = 0; j < size3; j++) {
                        matrix3[i][j] = in.nextInt();
                    }
                }
                int[][] newMat3= TransposeMatrix.transpose(size3,matrix3);
                for (int i = 0; i < size3; i++) {
                    for (int j = 0; j < size3; j++) {
                        System.out.print(newMat3[i][j]+" ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Enter the no of rows");
                int row4 = in.nextInt();
                System.out.println("Enter the no of column ");
                int column4 = in.nextInt();
                System.out.println("Enter the Elements");
                int[][] matrix4 = new int[row4][column4];
                for (int i = 0; i < row4; i++) {
                    for (int j = 0; j < column4; j++) {
                        matrix4[i][j] = in.nextInt();
                    }
                }
                UniqueMatrix.uniqueMat(row4,column4,matrix4);
                break;
            case 5:
                System.out.println("Enter the no of rows");
                int row5 = in.nextInt();
                System.out.println("Enter the no of column ");
                int column5 = in.nextInt();
                System.out.println("Enter the Elements");
                int[][] matrix5 = new int[row5][column5];
                for (int i = 0; i < row5; i++) {
                    for (int j = 0; j < column5; j++) {
                        matrix5[i][j] = in.nextInt();
                    }
                }
                int index=ReplaceMaxOnes.replaceMaxOnes(row5,column5,matrix5);
                for (int i = 0; i < row5; i++) {
                    for (int j = 0; j < column5; j++) {
                        if (index == i) {
                            matrix5[i][j] = 0;
                            System.out.print(matrix5[i][j] + " ");
                        } else {
                            System.out.print(matrix5[i][j] + " ");
                        }
                    }
                        System.out.println();
                }
                break;
            case 6:
                System.out.println("Enter the no of rows");
                int row6 = in.nextInt();
                System.out.println("Enter the no of column ");
                int column6 = in.nextInt();
                System.out.println("Enter the Elements");
                int[][] matrix6 = new int[row6][column6];
                for (int i = 0; i < row6; i++) {
                    for (int j = 0; j < column6; j++) {
                        matrix6[i][j] = in.nextInt();
                    }
                }
                int[][] newMat6=ReplaceWithZeros.replaceWithZeros(row6,column6,matrix6);
                for (int i = 0; i < row6; i++) {
                    for (int j = 0; j < column6; j++) {
                        System.out.print(newMat6[i][j]+" ");
                    }
                    System.out.println();
                }
                break;
            case 7:
                System.out.println("Enter the size of matrix");
                int size7= in.nextInt();
                System.out.println("Enter the Elements");
                int[][] matrix7 = new int[size7][size7];
                for (int i = 0; i < size7; i++) {
                    for (int j = 0; j < size7; j++) {
                        matrix7[i][j] = in.nextInt();
                    }
                }
                int[][] newMat7= SortAcrossLeftDiagonal.sortDiagonal(size7,matrix7);
                for (int i = 0; i < size7; i++) {
                    for (int j = 0; j < size7; j++) {
                        System.out.print(newMat7[i][j]+" ");
                    }
                    System.out.println();
                }
                break;
            case 9:
                 System.out.println("Enter the no of rows");
                 int row9 = in.nextInt();
                 System.out.println("Enter the no of column ");
                 int column9 = in.nextInt();
                 System.out.println("Enter the Elements");
                 int[][] matrix9 = new int[row9][column9];
                 for (int i = 0; i < row9; i++) {
                   for (int j = 0; j < column9; j++) {
                    matrix9[i][j] = in.nextInt();
                  }
                 }
                System.out.println(MaximalRectangle.maxRect(row9,column9,matrix9));
                break;
            case 10:
                System.out.println("Enter the no of rows");
                int row10 = in.nextInt();
                System.out.println("Enter the no of column ");
                int column10 = in.nextInt();
                System.out.println("Enter the Elements");
                int[][] matrix10 = new int[row10][column10];
                for (int i = 0; i < row10; i++) {
                    for (int j = 0; j < column10; j++) {
                        matrix10[i][j] = in.nextInt();
                    }
                }
                System.out.println("Enter the no of Rotation");
                int rotate=in.nextInt();
                System.out.println(SuperSimilar.findSuperSimilar(row10,column10,matrix10,rotate));
                break;
        }
    }
}