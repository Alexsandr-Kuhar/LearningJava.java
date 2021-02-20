package main.java.path_17;

import main.java.path_17.Api.Builder;
import main.java.path_17.Api.Person;

public class Task_68 { public static void main(String[] args) {
    Person person = new Builder()
            .thisAge(1988)
            .thisName("Alex")
            .thisSurname("Kat")
            .build();
    System.out.printf("Surname: %s;\nName: %s;\nYear of birth: %d;\n\n", person.getSurname(), person.getName(), person.getBirthYear());
}

}
