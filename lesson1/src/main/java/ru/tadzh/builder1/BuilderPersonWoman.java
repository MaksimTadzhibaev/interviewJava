package ru.tadzh.builder1;

public class BuilderPersonWoman extends AbstractBuilderPerson{
    @Override
    void buildFirstName() {
        person.setFirstName("no firstName");
    }

    @Override
    void buildLastName() {
        person.setLastName("no lastName");
    }

    @Override
    void buildMiddleName() {
        person.setMiddleName("no middleName");
    }

    @Override
    void buildCountry() {
        person.setCountry("Россия");
    }

    @Override
    void buildAddress() {
        person.setAddress("Тверь");
    }

    @Override
    void buildPhone() {
        person.setPhone("no phone");
    }

    @Override
    void buildAge() {
        person.setAge(0);
    }

    @Override
    void buildGender() {
        person.setGender("woman");
    }
}
