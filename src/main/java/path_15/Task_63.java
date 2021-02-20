package main.java.path_15;

import java.util.*;
import java.util.stream.Stream;

public class Task_63 {
    static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList();
        for (int i = 1; i <= 50; i++) {
            numberList.add(random.nextInt(400));
        }
        Optional<Integer> min = numberList.stream().min(Integer::compare);
        Optional<Integer> max = numberList.stream().max(Integer::compare);
        System.out.println("min"+min.get());
        System.out.println("max"+max.get());
       // Stream<Integer> stream = numberList.subList(min.get(), max.get()).stream();
        Stream<Integer> stream = numberList.stream();
        stream.filter(i -> i % 3 == 0 && i % 5 == 0).forEach(System.out::println);
    }
}