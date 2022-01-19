package ru.tadzh.poli;

public class Main {
    public static void main(String[] args) {
        System.out.println("Triangle:");
        Figure figureTriangle = new Triangle(5, 10);
        System.out.println(figureTriangle.perimeter());
        System.out.println(figureTriangle.area());

        System.out.println("Circle:");
        Figure figureCircle = new Circle(5);
        System.out.println(figureCircle.perimeter());
        System.out.println(figureCircle.area());

        System.out.println("Square:");
        Figure figureSquare = new Square(5);
        System.out.println(figureSquare.perimeter());
        System.out.println(figureSquare.area());
    }


}
