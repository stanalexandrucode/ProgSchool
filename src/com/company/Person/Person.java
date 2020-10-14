package com.company.Person;

public abstract class Person {
    private String name;
    private String birthDate;
    private String phoneNr;

    public Person(String name, String birthDate, String phoneNr) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNr = phoneNr;
    }

    public abstract void tick();

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNr=" + phoneNr +
                '}';
    }
}
