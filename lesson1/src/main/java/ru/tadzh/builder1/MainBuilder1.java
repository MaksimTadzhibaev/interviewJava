package ru.tadzh.builder1;

public class MainBuilder1 {
    public static void main(String[] args) {
        Director director1 = new Director();
        director1.setBuilderPerson(new BuilderPersonMan());
        Person personMan = director1.buildPerson();
        personMan.setFirstName("Иван");
        personMan.setLastName("Иванов");
        personMan.setMiddleName("Иванович");
        personMan.setPhone("+79001234567");
        personMan.setAge(50);
        System.out.println(personMan);

        Director director2 = new Director();
        director2.setBuilderPerson(new BuilderPersonWoman());
        Person personWoman = director2.buildPerson();
        personWoman.setFirstName("Анна");
        personWoman.setLastName("Иванова");
        personWoman.setMiddleName("Ивановна");
        personWoman.setPhone("+79001234568");
        personWoman.setAge(40);
        System.out.println(personWoman);
    }
}
