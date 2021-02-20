package main.java.path_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task_40 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(Arrays.asList(1,10,1,2,2,1,4,5,2));
        List numberNew=new ArrayList();
        for (Integer a:number) {
            if (!numberNew.contains(a)) {
    numberNew.add(a);
}
        }
        System.out.println(number);
        System.out.print(numberNew);
    }
}
