package com.jarvis.day05;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length: ");
        double length = input.nextDouble();
        System.out.print("Please enter the width: ");
        double width = input.nextDouble();
        input.close();

        double perimeter = (length + width) * 2;
        double area = length * width;
        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);

    }

}
