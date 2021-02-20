package main.java.path_6;

import java.util.Scanner;

public class Task_28 {
    public static void main(String[] args) {
        Scanner text =  new Scanner(System.in);
        String Input =text.nextLine();
        String S = Input.replaceAll("[.,:;!?\\-]"," ").trim();
        S+=" ";
        for (int i = 0; i <S.length(); i++) {
            if (S.charAt(i)==' ' && S.charAt(i-1)!=' ' )
            {
            System.out.print(S.charAt(i-1)+" ");}
            }
//2 способ решения
        System.out.print("\n The second method \n");
        String[] words = Input.split("\\s");
        for (int j = 0; j < words.length; j++)
        {
            System.out.print(words[j].charAt(words[j].length()-1)+" ");
        }

    }
}


