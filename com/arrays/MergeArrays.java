package com.arrays;
//https://leetcode.com/problems/merge-sorted-array/solution/
public class MergeArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        for(int i=0;i<m;i++){
            nums1Copy[i] = nums1[i];
        }
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1Copy[i]<=nums2[j]){
                nums1[k] = nums1Copy[i];
                i++;
                k++;
                }
            else{
                nums1[k] = nums2[j];
                k++;
                j++;
            }
        }
            while(i<m){
                nums1[k] = nums1Copy[i];
                k++;
                i++;
            }
            while(j<n){
                nums1[k] = nums2[j];
                j++;
                k++;
            }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1, 3, nums2, 3);
        for(int each:nums1){
            System.out.println(each);
        }
    }
}
