package main.java.path_6;

import java.util.Scanner;

public class Task_30 {
    public static void main(String[] args) {
        Scanner text =  new Scanner(System.in);
        String S="<p align=\"left\">Выравниваем абзац по левому краю.</p>\n" +
                "<p align=\"right\">Выравниваем абзац по правому краю.</p>\n" +
                "<p align=\"center\">Выравниваем абзац по центру.</p>";
        System.out.println(S.replaceAll("<p([^<]*)>","<p>"));//
        // <p.*?>
    }
}
