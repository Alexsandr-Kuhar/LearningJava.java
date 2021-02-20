package main.java.path_4;

public class Task_20 {
    public static void main(String[] args) {
        int a[] ={21,1,35,4,5,6,15,34,38,4};
        int h=a[0],i=0,l=0;
        for (i=0;i<=9;i++)
        {
            if (a[i]>h)
            {h=a[i];l=i;}
        }
System.out.println("Index "+ l);
    }
}
