package main.java.path_3;
public class Task_17 {
    public static void main(String[] args) {
        int i,k;
        Integer ZZZ = 20023143;
        String str = Integer.toString(ZZZ);;
        char[] result = str.toCharArray();
        if (str.length()%3==0)
        {k=-1;}
        else if (str.length()%3==1)
        {k=1;} else
        {k=0;}
        for (i=0;i<=str.length()-1;i++)
        {
            k++;
           if (k==3)
            {System.out.print(" ");k=0;}
            System.out.print(result[i]);
        }
    }
}
