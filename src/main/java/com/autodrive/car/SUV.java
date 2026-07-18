package main.java.com.autodrive.car;

import main.java.com.autodrive.engine.Engine;

public class SUV extends Car{

    public SUV(Engine engine){
        super(engine);
        System.out.println(typeOfCar() +"created with" + getEngineType());
    }
    @Override
    public String typeOfCar() {
        return "SUV";
    }
}
