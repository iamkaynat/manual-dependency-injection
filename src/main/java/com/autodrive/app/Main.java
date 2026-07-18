package main.java.com.autodrive.app;

import main.java.com.autodrive.car.Car;
import main.java.com.autodrive.car.SUV;
import main.java.com.autodrive.car.Sedan;
import main.java.com.autodrive.engine.DieselEngine;
import main.java.com.autodrive.engine.Engine;
import main.java.com.autodrive.engine.PetrolEngine;
import main.java.com.autodrive.garage.Garage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();
       //Creating a Car object with Sedan type
        Car sedan = new Sedan(petrolEngine);
        Car suv = new SUV(dieselEngine);

        Garage garage = new Garage();
        garage.addCar(suv);
        garage.addCar(sedan);
        sedan.startCar();
        sedan.stopCar();
        suv.startCar();
        suv.stopCar();
        garage.startAllCars();
        garage.stopAllCars();
    }
}