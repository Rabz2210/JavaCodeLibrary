package com.map;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
       if(o1.getRollNo()==o2.getRollNo())return 0;
       else if(o1.getRollNo()<o2.getRollNo())return -1;
       return 1;
    }
    
}
