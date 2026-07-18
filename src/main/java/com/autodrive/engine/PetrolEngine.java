package main.java.com.autodrive.engine;

import main.java.com.autodrive.car.Car;

public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Starting petrol engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping petrol engine");
    }

    @Override
    public String displayType() {
        //System.out.println("This is a petrol engine");
        return "Diesel Engine";
    }
}
