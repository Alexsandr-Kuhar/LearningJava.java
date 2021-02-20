package main.java.path_4;

public class Task_23 {

    public static void main(String[] args) {

        int a[][] = new int[5][5];
        int i, j;
        for (i = 0; i <= a.length-1; i++) {
            for (j = 0; j <= a.length-1; j++) {
                if ((j < i) || (j >= (a[i].length - i))) {
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }
        for (i = a.length - 1; i >= a.length / 2 + 1; i--) {
            for (j = 0; j < a[i].length; j++) {
                if ((j < (a[i].length - 1 - i)) || (j > i))
                    a[i][j] = 0;
                else
                    a[i][j] = 1;
            }
        }
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
    }
}