package com.jarvis.day06;

import java.awt.Point;

public class PrimitiveAndReference {

    public static void main(String[] args) {

        int a=3 ;
        int b = a;
        b = 4;
        System.out.println(a + " " + b);

        Point p1 = new Point(3, 3);
        Point p2 = p1;
        p2.x = 4;

        System.out.println(p1.x + " " + p2.x);

    }

}

