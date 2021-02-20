package main.java.path_6;

import java.util.Scanner;

public class Task_29 {
    public static String Find(String s)
    {
        StringBuffer Buffer = new StringBuffer();
        String[] words = s.split("\\s");
        for (String subStr : words)
        {
            if (subStr.matches("-?[0-9a-fA-F]+"))
            {
                Buffer.append(subStr+"(16) --"+ Integer.parseInt(subStr,16) + "(10) \n");
            }
        }
        return Buffer.toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Find(in.nextLine()));
    }
}
