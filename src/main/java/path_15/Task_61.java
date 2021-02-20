package main.java.path_15;

import java.util.stream.Stream;

public class Task_61 {

    public static void main(String[] args) {
      Stream<Float> sm;
        sm = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
                  .filter(i->i%2==0)
                .map(x->{System.out.print("\n "+x+" см это дюйма ");
                        return(float)(x*2.54);});

        sm.forEach(str->System.out.print(str+" "));
        Stream<Float> Sum = Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20).filter(val -> val % 2 == 0).map(val -> (float) (val*2.54f));
        Float sum = Sum.reduce(0f, (a, b) -> a + b);
        System.out.println("sum: " + sum);
    }
    }

