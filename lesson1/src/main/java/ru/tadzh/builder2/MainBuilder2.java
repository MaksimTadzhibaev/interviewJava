package ru.tadzh.builder2;

public class MainBuilder2 {
    public static void main(String[] args) {
    Person person = new BuilderPerson()
            .buildFirstName("Петр")
            .buildLastName("Петров")
            .buildMiddleName("Петрович")
            .buildCountry("Россия")
            .buildAddress("Москва")
            .buildPhone("+7910123456")
            .buildAge(55)
            .buildGender("муж")
            .build();

        System.out.println(person);
    }
}
