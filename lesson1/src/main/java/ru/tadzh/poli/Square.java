package ru.tadzh.poli;

public class Square extends Figure{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double perimeter() {
        return getSide()*4;
    }

    @Override
    double area() {
        return getSide()*getSide();

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
