package smart.oven.micronaut.m3.factory;

import jakarta.inject.Singleton;

@Singleton
public class CombiOven {
    private Microwave microwave;

    public CombiOven(Microwave microwave){
        this.microwave = microwave;
    }

    public void turnOnMicrowave(){
        microwave.turnOn();
    }

    public void turnOn(){
        System.out.println("Turning on the Oven");
    }
}
