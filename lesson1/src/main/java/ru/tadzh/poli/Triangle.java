package ru.tadzh.poli;

public class Triangle extends Figure{

    private double side;

    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    double perimeter() {
        return getSide()*3;
    }

    @Override
    double area() {
        return (getSide()*getHeight())/2;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
