package com.arrays;

//https://leetcode.com/problems/search-a-2d-matrix/
//Medium
public class searchA2dMatrix {

    public static boolean searchMatrix(int[][] matrix,int target){
        if(matrix.length>0 && matrix[0].length>0){
            int rowIndex=0;
            while(rowIndex<matrix.length){
                if(target<=matrix[rowIndex][(matrix[rowIndex].length)-1])break;
                rowIndex++;
            }
            if(rowIndex<matrix.length){
                for(int i=0;i<matrix[rowIndex].length;i++){
                    if(target==matrix[rowIndex][i])return true;
                }
                return false;
            }
        }
        return false;
    }


    //Optimized Solution

    public static void main(String[] args) {
        int[][] test = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int[][] test1 = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int[][] test3 = new int[][]{{1}};
       // System.out.println(searchMatrix(test,3));
        //System.out.println(searchMatrix(test1,13));
        System.out.println(searchMatrix(test3,2));
    }
    
}
