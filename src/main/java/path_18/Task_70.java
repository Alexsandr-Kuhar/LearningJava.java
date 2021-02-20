package main.java.path_18;

import main.java.path_18.Api.Man;

import java.lang.reflect.Field;

public class Task_70 {public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    Man man = new Man("Fedya1", "Fedya2");
    System.out.println(man.getField2());
    Field field = Man.class.getDeclaredField("field1");
    field.setAccessible(true);
    System.out.println(field.get(man));
    field.set(man, "Fedya3");
    System.out.println(field.get(man));
}
}
