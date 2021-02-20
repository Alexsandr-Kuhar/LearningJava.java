package main.java.path_3;

import java.math.BigInteger;

public class Task_13 {
    public static void main(String[] args) {
    int i=1;
    BigInteger s = BigInteger.ONE;
        do {
        s = s.multiply(BigInteger.valueOf(i));//multiply- raznosti s pred znach
            System.out.println(i + " -- " + s);
        i++;
    }while (i<=25);
}
}
