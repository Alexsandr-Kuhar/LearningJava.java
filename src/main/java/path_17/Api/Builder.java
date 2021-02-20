package main.java.path_17.Api;

public class Builder {
    public  String surname;
    public String name;
    public int Year;
    public Builder thisAge(int yearBirthDay) {
        this.Year = yearBirthDay;
        return this;
    }

    public Builder thisName(String name) {
        this.name = name;
        return this;
    }

    public Builder thisSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
