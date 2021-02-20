package main.java.path_7;

import main.java.path_7.api.Task_32.ActiveVacuumCleaner;
import main.java.path_7.api.Task_32.ActiveFridge;

public class Task_32 {
    public static void main(String[] args) {
        ActiveFridge fridge = new ActiveFridge(22,22,22);
        fridge.on();
        fridge.Freeze();
        fridge.Output();
        ActiveVacuumCleaner cleaner = new ActiveVacuumCleaner(44,44,44);
        cleaner.on();
        cleaner.ReplaceBag();
        cleaner.Output();





    }
}
