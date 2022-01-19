package ru.tadzh.error;


abstract class Car {

//Класс Engine не создан, предполагаю необходимо было создать Enum
//Необходимо сделать поле приватным

    public Engine engine;
    private String color;
    private String name;

//возможно стоило вынести метод в новый или существующий интерфейс

    protected void start() {
        System.out.println("Car starting");
    }

//возможно стоило вынести метод в новый или существующий интерфейс

    abstract void open();

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}