package main.java.path_11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_50 {
    public String dir="./src/main/java/path_11/Api/task_50/One_dir/Two_dir/Three_dir/";
    public  String nameFile="file";
    public int i;
    public String exp=".txt";

public void CreateCatalog()
{
    File dir0 = new File(this.dir);
    if (!dir0.exists()) {
        System.out.println("Созданы каталоги - " + dir0.getName());
        dir0.mkdirs();
    } else {
        System.err.println("Уже есть каталог ");
    }
}

 public void CreateFile(int number) throws IOException {
    String dirFinal=this.dir+this.nameFile+number+this.exp;
    try {
        BufferedWriter out = new BufferedWriter(new FileWriter(dirFinal));
      String s="";

        for (int i = 0; i < 10; i++) {
           s+=(int) (Math.random() * 25)+" ";
        }
        out.write(s);
        out.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public void AllSafeInOneFile() throws IOException {
    String all="";
    for (int i = 0; i < 5; i++) {
        String dirFinal = this.dir + this.nameFile + i + this.exp;
        File file = new File(dirFinal);
        Scanner read = new Scanner(file);
        String s = read.nextLine();
        String[] words = s.trim().split("\\D");

        for (String g : words) {
            all+=g+" ";
            System.out.print(g + " ");
        }
        System.out.println();
        all=all+"\n";
        System.gc();
    }
    //Запись в файл инф 5 файлов
    try {
        BufferedWriter out = new BufferedWriter(new FileWriter(dir+"all.txt"));
        out.write(all);
        out.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
//Содержит список файлов данного каталога
    public void SafeCatalog()
    {    File dir = new File(this.dir);
        List<String> files = new ArrayList<>();
        for ( File file : dir.listFiles() ){
            if ( file.isFile() )
                files.add(file.getName());
        }
        System.out.println(files);

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(this.dir+"ListCatalog.txt"));
            out.write(files.toString());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        Task_50 work = new Task_50();
        work.CreateCatalog();
        for (int i = 0; i < 5; i++) {
            work.CreateFile(i);
        }
        work.AllSafeInOneFile();
        work.SafeCatalog();
    }
}
