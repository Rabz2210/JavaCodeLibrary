package com.rough;

import java.time.LocalDateTime;

public class scoreCheck {
    
    public static void main(String[] args) {
            long days = 2;
            System.out.println(LocalDateTime.now());
            System.out.println(LocalDateTime.now().minusDays(days));
            days--;
            System.out.println(LocalDateTime.now().minusDays(days));
            days--;
            System.out.println(LocalDateTime.now().minusDays(days));
            days--;
            System.out.println(LocalDateTime.now().minusDays(days));
            days--;

        }
    }

