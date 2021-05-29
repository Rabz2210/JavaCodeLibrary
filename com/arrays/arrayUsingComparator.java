package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
class Movie{
    int rating;
    String name;

    Movie(int r, String na){
        this.rating  =r;
        this.name = na;
    }
}

public class arrayUsingComparator {
    public static void main(String[] args) {
        Movie ob1 = new Movie(4, "a");
        Movie ob2 = new Movie(7, "b");
        Movie ob3 = new Movie(1, "c");
        Movie ob4 = new Movie(3, "d");
       //PriorityQueue<Movie>pq = new P

        List<Movie>al = new ArrayList<Movie>();
        al.add(ob1);
        al.add(ob2);
        al.add(ob3);
        al.add(ob4);
        for(Movie ob:al){
            System.out.println(ob.rating);
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        Collections.sort(al, new Comparator<Movie>(){
            
            @Override
            public int compare(Movie ob1,Movie ob2){
                if(ob1.rating>ob2.rating)return 1;
                else if(ob1.rating==ob2.rating)return 0;
                else return -1;
            }
        });
        for(Movie ob:al){
            System.out.println(ob.rating);
        }
    }
    
}
