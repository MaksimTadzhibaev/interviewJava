package ru.tadzh.builder1;

public class Director {
    AbstractBuilderPerson builderPerson;

    public void setBuilderPerson(AbstractBuilderPerson builderPerson) {
        this.builderPerson = builderPerson;
    }

    Person buildPerson(){
        builderPerson.createPerson();

        builderPerson.buildFirstName();

        builderPerson.buildLastName();

        builderPerson.buildMiddleName();

        builderPerson.buildCountry();

        builderPerson.buildAddress();

        builderPerson.buildPhone();

        builderPerson.buildAge();

        builderPerson.buildGender();

        Person person = builderPerson.getPerson();

        return person;
    }
}
