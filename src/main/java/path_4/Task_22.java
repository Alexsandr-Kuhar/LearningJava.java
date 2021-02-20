package main.java.path_4;

import java.util.Arrays;

public class Task_22 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int i;
        for (i=0;i<=9;i++) {
            System.out.print(a[i]+" ");
            a[i]=a.length+1-a[i];
        }
            System.out.print("\n "+Arrays.toString(a));
    }
}
