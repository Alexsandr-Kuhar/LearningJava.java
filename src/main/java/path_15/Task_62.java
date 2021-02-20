package main.java.path_15;

import main.java.path_15.Api.Person;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Task_62
{
    public static void main(String[] args) {
        Random rand =new Random(15);
        ArrayList<Person>person=new ArrayList<>();
         for (int i=0;i<20;i++)
        { int s= rand.nextInt(15)+15;
        person.add(new Person("Aleksandr"+s,"Kuharhuk"+s,s));
          //  System.out.println(person.get(i).getName()+" "+person.get(i).getSurname()+" "+person.get(i).getAge());
        }
        Stream<Person> stream= person.stream();
         stream.filter(obj->obj.getAge()<21).forEach(System.out::println);
    }

}
