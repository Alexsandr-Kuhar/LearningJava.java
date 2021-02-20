package main.java.path_3;

public class Task_15 {
    public static void main(String[] args) {
        int i, k=0;
        for (i = 50; i <= 70; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0 && i % 6 != 0 && i % 7 != 0 && i % 8 != 0 && i % 9 != 0)
            {   k++;
                if (k == 2) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}