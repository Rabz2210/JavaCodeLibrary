package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/course-schedule-iii/

public class CourseScheduleIII {
    public static int scheduleCourse(int[][] courses) {
        int length = courses.length;
       Arrays.sort(courses,Comparator.comparingInt(a -> a[1]));
       PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
        int currentTime=0;
        int count=0;
        for(int i=0;i<length;i++){
            int[] course = courses[i];
            currentTime+=course[0];


        }
        
       return count; 
    }
    public static void main(String[] args) {
        int [][] arry = {{5,15},{3,19},{6,7},{2,10},{5,16},{8,14},{10,11},{2,19}};
        System.out.println(" "+scheduleCourse(arry));
    }
}
