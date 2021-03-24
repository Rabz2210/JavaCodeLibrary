package com.matrix;

public class matrixInSnakePattern {

    public static void printSnakePattern(int[][] matrix){
        int length = matrix.length;
        for(int i=0;i<length;i++){
            if(i%2==0){
                int j=0;
                while(j<length){
                    System.out.print(" "+matrix[i][j]);
                    j++;
                }
            }else{
                int j=length-1;
                while(j>=0){
                    System.out.print(" "+matrix[i][j]);
                    j--;
                }
            }
        }
    }
    

    public static void main(String[] args) {
        int[][] test = { {10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50}};
        printSnakePattern(test);
    }
}
