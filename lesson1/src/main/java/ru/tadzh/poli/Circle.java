package ru.tadzh.poli;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return  2*PI*getRadius();
    }

    @Override
    double area() {
        return PI*(getRadius()*getRadius());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
