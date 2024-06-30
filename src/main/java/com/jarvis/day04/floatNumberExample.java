package com.jarvis.day04;

public class floatNumberExample {

    public static void main(String[] args) {

        int x=10;
        try {
            x = x / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division durch Null ist nicht erlaubt.");
        }
        System.out.println(x);

        int max = Integer.MAX_VALUE;
        System.out.println(max);
        max = max + 1;
        System.out.println(max);

        double d = 123.456;
        double e = d*d;
        float f = (float) e;

        System.out.println(e);
        System.out.println(f);

    }

}
