package com.matrixtask;

import java.util.Stack;

public class MaximalRectangle {
    public static int largestRectArea(int[] height){
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int maxArea=0;
        for(int i=0;i<=height.length;i++){
            int val=i== height.length?0:height[i];

            while (stack.peek()!=-1&&height[stack.peek()]>=val){
                int right=i;
                int high=height[stack.pop()];
                int left=stack.peek();
                maxArea=Math.max(maxArea,high*(right-left-1));
            }
            stack.push(i);
        }
        return maxArea;
    }
    public static int maxRect(int row,int col,int[][] mat){
        int[] height=new int[col];
        for(int i=0;i<col;i++){
            height[i]=mat[0][i];
        }
        int area=largestRectArea(height);
        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    height[j]++;
                } else {
                    height[j]=0;
                }
            }
        }
        area = Math.max(area,largestRectArea(height));
        return area;
    }
}
