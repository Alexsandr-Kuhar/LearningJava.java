package main.java.test.potoki.synchrinized;

import java.io.FileWriter;
import java.io.IOException;

public class Resource {
    private FileWriter fileWriter;
    Resource(String file) throws IOException {
        fileWriter = new FileWriter(file, true);
    }

    public synchronized void writing(String str, int i) {
        try {
            fileWriter.append(str+i);
            System.out.print(str+i);
            Thread.sleep(1000);
            fileWriter.append("->" + i + " ");
            System.out.println("->" + i + " ");
        } catch (IOException | InterruptedException e) {
            System.err.print("ошибка файла: " + e);
        }
    }

    public void close() {
try {fileWriter.close();
}catch (IOException e){
    System.err.print("ошибка закрытия файла"+e);
}
    }
}