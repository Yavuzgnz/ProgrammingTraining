package com.jarvis.day04;

import java.util.Random;

public class randomNumbers {

    public static void main(String[] args) {

        Random x = new Random();

        float r = x.nextFloat();
        System.out.println(r);

        int i = x.nextInt(100);
        System.out.println(i);

        long l = x.nextLong();
        System.out.println(l);

    }

}
