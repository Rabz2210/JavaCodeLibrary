package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortingOrderArrays {
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<Student>();
        Student s1 = new Student(1,"Rabbani");
        Student s2 = new Student(2,"Arman");
        Student s3 = new Student(3,"Rabbani");
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        Collections.sort(ls, new StudentComparater());
        ls.forEach(data ->{
            System.out.println(data.getName()+" "+data.getRollNo());
        });
    }
}

class StudentComparater implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2){
        int res = s1.getName().compareTo(s2.getName());
        if(res==0){
            return s1.getRollNo().compareTo(s2.rollNo);
        }
        return res;
    }
}


class Student{
    Integer rollNo;
    String name;

    Student(int rollNo, String name){
            this.rollNo = rollNo;
            this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
