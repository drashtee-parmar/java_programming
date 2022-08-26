package com.company;

public class Circle {
    //instance variable
    private double radius;

    //getters
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return ((radius * radius) * Math.PI);
    }

    //constructor
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }
}
