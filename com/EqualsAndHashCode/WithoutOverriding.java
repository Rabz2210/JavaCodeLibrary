package com.EqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

public class WithoutOverriding {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Rabbani");
        Student s2 = new Student (2,"Arman");
        Student s4 = new Student(1,"Rabbani");
        Student s3 = s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
      
        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());

        System.out.println("___________________");
        System.out.println("___________________");

        Set<Student> set = new HashSet<Student>();
        set.add(s1);
        set.add(s4);
        for(Student each: set){
            System.out.println(each.getName());
        }
    }
}
