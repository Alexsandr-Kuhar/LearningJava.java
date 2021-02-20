package main.java.path_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Task_51 {
    private String dir = "./src/main/java/path_11/Api/task_51/";
    HashMap<Integer, String> mapName = new HashMap<>();
    HashMap<Integer, String> mapSurname = new HashMap<>();
    HashMap<Integer, Integer> mapAge = new HashMap<>();

    public void Reactive(int number, String name, String surname, int age) {
        mapName.put(number, name);
        mapSurname.put(number, surname);
        mapAge.put(number, age);
    }
    public void Record() {
        Set<Integer> keys = mapName.keySet();
        ArrayList<String> valName = new ArrayList<>(mapName.values());
        ArrayList<String> valSurname = new ArrayList<>(mapSurname.values());
        ArrayList<Integer> valAge = new ArrayList<>(mapAge.values());
        String s = "";
        for (int i = 0; i < keys.size(); i++) {
            s += valName.get(i) + " " + valSurname.get(i) + " " + valAge.get(i) + "\n";
        }
        System.out.println(s);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(this.dir + "Person.txt"));
            out.write(s);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Task_51 person = new Task_51();
        person.Reactive(0, "Ivan0", "Ivanov0", 20);
        person.Reactive(1, "Ivan1", "Ivanov1", 21);
        person.Reactive(2, "Ivan2", "Ivanov2", 22);
        person.Reactive(3, "Ivan3", "Ivanov3", 23);
        person.Reactive(4, "Ivan4", "Ivanov4", 24);
        person.Reactive(5, "Ivan5", "Ivanov5", 25);
        person.Reactive(6, "Ivan6", "Ivanov6", 26);
        person.Reactive(7, "Ivan7", "Ivanov7", 27);
        person.Reactive(8, "Ivan8", "Ivanov8", 28);
        person.Reactive(9, "Ivan9", "Ivanov9", 29);
        person.Record();
    }
}
