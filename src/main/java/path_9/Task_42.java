package main.java.path_9;

import java.util.*;

public class Task_42 {
    public static void main(String[] args) {
        String s="пара апррв пара мсиав пара смимси пара мсиав";
        String[] words = s.split("\\s");
        Map<String,Integer> map = new HashMap<>();
        for (int j = 0; j < words.length; j++) {
            map.merge(words[j], 1, Integer::sum);
        }
       System.out.println(map);
    }
}
