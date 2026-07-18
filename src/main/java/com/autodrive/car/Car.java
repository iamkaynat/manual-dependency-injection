package main.java.com.autodrive.car;

import main.java.com.autodrive.engine.Engine;

public abstract class Car {
    private final Engine engine;

    public Car(Engine engine){
        this.engine=engine;
    }

    public void startCar(){
        System.out.println(typeOfCar() + " is starting");
        engine.start();
    }
    public void stopCar(){
        System.out.println(typeOfCar()+ " is stopping");
        engine.stop();
    }
    public abstract String typeOfCar();

    public String getEngineType(){
        return engine.displayType();
    }
}
