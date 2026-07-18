package main.java.com.autodrive.engine;

public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting Diesel engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Diesel engine");
    }

    @Override
    public String displayType() {
        return "Diesel Engine";
    }
}
