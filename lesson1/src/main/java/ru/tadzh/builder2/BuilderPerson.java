package ru.tadzh.builder2;

public class BuilderPerson {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    BuilderPerson buildFirstName (String firstName){
     this.firstName = firstName;
     return this;
    }

    BuilderPerson buildLastName (String lastName){
        this.lastName = lastName;
        return this;
    }

    BuilderPerson buildMiddleName (String middleName){
        this.middleName = middleName;
        return this;
    }

    BuilderPerson buildCountry (String country){
        this.country = country;
        return this;
    }

    BuilderPerson buildAddress (String address){
        this.address = address;
        return this;
    }

    BuilderPerson buildPhone (String phone){
        this.phone = phone;
        return this;
    }

    BuilderPerson buildAge (int age){
        this.age = age;
        return this;
    }

    BuilderPerson buildGender (String gender){
        this.gender = gender;
        return this;
    }

    Person build(){
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setMiddleName(middleName);
        person.setCountry(country);
        person.setAddress(address);
        person.setPhone(phone);
        person.setAge(age);
        person.setGender(gender);
        return person;
    }
}
