package main.java.path_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task_41 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(4,3,2,5,1,3,8,3,4,5,6,7));
        Iterator<Integer> it=list.iterator();
        int m=0;
        while (it.hasNext())
        {
            if (it.next()>=m)
            {
                m=it.next();
            }
        }
        System.out.println(m);
    }
}
