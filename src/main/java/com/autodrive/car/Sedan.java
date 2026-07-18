package main.java.com.autodrive.car;

import main.java.com.autodrive.engine.Engine;

public class Sedan extends Car{

    public Sedan(Engine engine) {
        super(engine);
        System.out.println(typeOfCar() + "created with " + getEngineType());
    }
    @Override
    public String typeOfCar() {
        return "Sedan";

    }
}
