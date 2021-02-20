package main.java.path_3;

public class Task_14 {
    public static void main(String[] args) {
        long i=7893823445L;
        long sum=0;
        do
        {  sum+=(i%10);
            i/=10;
        } while (i!=0);
        System.out.println(sum);
    }
}
