package main.java.path_4;

public class Task_21 {
    public static void main(String[] args) {
int size=10;
int a[] = new int[size];
int i=0;
        do
            {
            a[i] = (int) (Math.random() * 25);
           System.out.print(a[i]+"("+i+") ");
           i++;
        } while (size>i);
        System.out.println(" ");
        int max=a[0],min=a[0];
        for (i=0;i<=a.length-1;i++)
        {
            if (a[i]<min)
           {
               min=a[i];
           }
            if (a[i]>max)
            {
                max=a[i];
                 }
        }
        int k1=0,k2=0;
        for (i=0;i<=a.length-1;i++) {
            if (max == a[i]) {
                k1++;
            }
            if (min == a[i]) {
                k2++;
            }
        }
        int Max_Index[]= new int[k1];
        int Min_Index[]= new int[k2];
        k1=0;k2=0;
        for ( i=0;i<=a.length-1;i++) {
            if (max == a[i]) {
                Max_Index[k1] = i;
                k1++;
            }
            if (min == a[i]) {
                Min_Index[k2] = i;
                k2++;
            }
        }
       int sum_first=0,sum_second=0;
            for (i = Max_Index[0] + 1; i <= Min_Index[Min_Index.length - 1] - 1; i++) {
                sum_first += a[i];
            }
            for (i = Min_Index[0] + 1; i <= Max_Index[Max_Index.length - 1] - 1; i++) {
               sum_second += a[i];
           }
        System.out.println(sum_first+" "+sum_second);
            if (sum_second>sum_first)
           {System.out.println("Summa = "+ sum_second);}
           else {System.out.println("Summa = "+ sum_first);}
        System.out.print(" Max_index ");
        for (i=0;i<=k1-1;i++)
        {
            System.out.print(Max_Index[i]+" ");
        }
        System.out.print("\n Min_index ");
        for (i=0;i<=k2-1;i++)
        {
            System.out.print(Min_Index[i]+" ");
        }
    }
}
