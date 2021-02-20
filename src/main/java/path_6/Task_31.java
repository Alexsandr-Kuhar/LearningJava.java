package main.java.path_6;

public class Task_31 {
       public static String Print_String(String S)
       {
           String l="";
           for (long i=1;i<=100000;i++)
           {
               l+=S;
           }
           System.out.println(l);
           return S;
       }
       public static String Print_Append(String S)
       {
           StringBuffer Buffer = new StringBuffer();
           for (long i=1;i<=100000;i++)
           {
               Buffer.append(S);
           }
           System.out.println(Buffer.toString());
           return S;
       }
        public static void main(String[] args) {
        String S="aaabbbccc";
        long startString = System.currentTimeMillis();
        Print_String(S);
        long finishString = System.currentTimeMillis();

        long startAppend = System.currentTimeMillis();
        Print_Append(S);
        long finishAppend = System.currentTimeMillis();

        float secString = finishString - startString;
        float secAppend = finishAppend - startAppend;
        System.out.println("Time of String "+secString/1000+" сек");
        System.out.println("Time of Append "+secAppend/1000+" сек");
    }
}
