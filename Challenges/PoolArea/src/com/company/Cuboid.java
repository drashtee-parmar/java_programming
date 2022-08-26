package com.company;

public class Cuboid extends Rectangle {
    //instance field
    private double height;

    //constructors

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    //Getter

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
