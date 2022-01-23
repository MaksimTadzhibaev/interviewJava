package ru.tadzh.error;

//нельзя extends несколько классов, интерфейсы необходимо implements
class Lorry extends Car, Moveable, Stopable{

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }
}
