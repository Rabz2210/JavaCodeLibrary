package com.arrays;

public class booking {

    public static boolean canAttendMeetings(int[][] intervals) {
        if(intervals.length==0)return true;
        boolean[] booking = new boolean[10000000];
        for(int[] each: intervals){
            if(booking[each[0]] || booking[each[1]])return false;
            AttendMeeting(each,booking);
        }
            return true;
    }
    
    public static void AttendMeeting(int[] meeting, boolean[] booking){
        for(int i=meeting[0];i<=meeting[1];i++){
                booking[i]=true;
        }
    }
    public static void main(String[] args) {
        System.out.println(canAttendMeetings(new int[][]{{6,10},{13,14},{12,14}}));
    }
}
