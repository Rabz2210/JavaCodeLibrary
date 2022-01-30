package com.arrays;

public class plusOneII {
    public static int[] plusOne(int[] digits) {
        boolean carryOn = false;
        int length = digits.length-1;
        int j = length+1;
        
        do{
            if((digits[length]+1)>9){
                digits[length] = 0;
                carryOn=true;
            }else{
                digits[length]+=1;
                carryOn = false;
            }
            length--;
        }while(carryOn && length>=0);
        
        if(carryOn){
            int[] res = new int[j+1];
            res[0] = 1;
            int k=1;
            for(int i=0;i<j;i++){
                res[k] = digits[i];
                k++;
            }
            return res;
        }
        return digits;
    }

    

    public static void main(String[] args) {
        int[] arr= new int[]{9,9,9,9};
        int[] res = plusOne(arr);
        for(int each:res){
            System.out.print(each+" ");
        }
    }
}
