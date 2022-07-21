package com.map;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class userDefinedMapkeys {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rabbani");
        Student s2 = new Student(2, "Arman");
        Student s3 = new Student(3,"Mohammad");
        Set<Student> set = new TreeSet<Student>(new StudentComparator());
        set.add(s3);
        set.add(s2);
        set.add(s1);
        for(Student each: set){
            System.out.println(each.getName());
        }
    }
}
