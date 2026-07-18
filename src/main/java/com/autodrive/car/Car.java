package main.java.com.autodrive.car;

import main.java.com.autodrive.engine.Engine;

public abstract class Car {
    private final Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    public void startCar(){
        System.out.println("Car is starting");
    }
    public void stopCar(){
        System.out.println("Car is stopping");
    }
    public abstract void typeOfCar();
}
