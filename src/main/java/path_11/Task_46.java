package main.java.path_11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task_46 {
    public static void main(String[] args) throws IOException {
        File dir = new File("./src/main/java/path_11/");
        List<String> files = new ArrayList<>();
        List<String> catalog = new ArrayList<>();
        for ( File file : dir.listFiles() ){
            if ( file.isFile() )
                files.add(file.getName());
            else catalog.add(file.getName());
        }
        System.out.println("Файлы "+files);
        System.out.println("Папки "+catalog);
    }
}
