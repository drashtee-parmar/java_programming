package com.company;

public class Rectangle {
    //instance variable
    private double width;
    private double length;

    //constructor


    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    //Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return (width * length);
    }
}
