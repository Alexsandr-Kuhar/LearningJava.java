package main.java.path_3;

public class Task_12 {
    public static void main(String[] args) {
        int k=0,i=0;
        while (i<=10)
        {
            if (i==0)
            {k=1;
            System.out.println(i+ " --- " + k);
            i++; continue;}

            k=k*i;
            i++;
            System.out.println(i-1+ " --- " + k);
        }
    }
}
