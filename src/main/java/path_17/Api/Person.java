package main.java.path_17.Api;

public class Person {
    private final String surname;
    private final String name;
    private final int birthYear;

    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public  Person (Builder builder){
        surname = builder.surname;
        name = builder.name;
        birthYear = builder.Year;
    }
}
