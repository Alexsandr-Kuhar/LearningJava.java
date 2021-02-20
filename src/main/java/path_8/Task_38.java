package main.java.path_8;

import main.java.path_8.api.Task_38.Car;
import main.java.path_8.api.Task_38.Garage;
import main.java.path_8.api.Task_38.Motorcycle;

import java.util.Scanner;

public class Task_38 {
    public static Integer Input ()
    {
        Scanner g = new Scanner(System.in);
        return g.nextInt();
    }
    public static void main(String[] args) {
            Car audi = new Car("Audi A6");
        Motorcycle bmw =new Motorcycle("BMW K1200RS");
        Garage one = new Garage(audi);
        Garage two = new Garage(bmw);
        System.out.println(one.getVehicle());
        System.out.println(two.getVehicle());
    }
}
