package com.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class diagonalElementsOfMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        int N = mat.length;
        int M = mat[0].length;
        int d = M+N-1;
        int[] res = new int[d];
        int index = 0;
        ArrayList<Integer> ar;

        // We have to go over all the elements in the first
        // row and the last column to cover all possible diagonals
        for(int k=0;k<d;k++){

            // Clear the intermediate array every time we start
            // to process another diagonal
           ar = new ArrayList<Integer>();

           // We need to figure out the "head" of this diagonal
            // The elements in the first row and the last column
            // are the respective heads.
            int i  = k<M?0:k-M+1;
            int j = k<M?d:M-1;
            
            while(i<N && j >-1){
                ar.add(mat[i][j]);
                i++;
                j--;
            }

            if(k%2!=0){
                Collections.reverse(ar);
            }
            for(int each:ar){
                res[index] = each;
                index++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
