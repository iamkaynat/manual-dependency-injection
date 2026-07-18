package main.java.com.autodrive.garage;

import main.java.com.autodrive.car.Car;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private final List<Car> carsInGarage = new ArrayList<>();
    public void addCar(Car car){
        carsInGarage.add(car);
        System.out.println( car.typeOfCar() +" " + car.getEngineType() + " added into the garage");

    }

    public void removeCar(Car car){
        carsInGarage.remove(car);
        System.out.println( car.typeOfCar() +" " + car.getEngineType() + " removed from the garage");

    }

    public void displayAllCars(){

        for(Car c : carsInGarage){
            System.out.println(c.typeOfCar() + "(" + c.getEngineType() + ")");
        }
        System.out.println("Total cars" + getTotalCars());
    }
    public void startAllCars(){
        if (carsInGarage.isEmpty())
            System.out.println("No Cars in garage");
        for(Car c : carsInGarage){
            c.startCar();
        }
    }
    public void stopAllCars(){
        if (carsInGarage.isEmpty())
            System.out.println("No Cars in garage");
        for(Car c : carsInGarage){
            c.stopCar();
        }
    }

    public int getTotalCars(){
        int totalCount =0;
        for(Car c : carsInGarage){
            totalCount+=1;
        }
        return totalCount;
    }
}
