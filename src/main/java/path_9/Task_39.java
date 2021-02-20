package main.java.path_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_39 {
    public static void main(String[] args) {
        List<Integer> evaluations = new ArrayList<>();
        for (int i=1;i<=10;i++) {
            evaluations.add((int) (Math.random() * 10));
        }
           System.out.print(evaluations);

        Iterator<Integer> it=evaluations.iterator();
            while (it.hasNext()) {
                if (it.next() < 4) {
                    it.remove();
                }
            }
            System.out.print(evaluations);
    }
}
