package smart.oven.micronaut.m3.beans;

import jakarta.inject.Singleton;

@Singleton
public class Grills {
    public void turnOn(){
        System.out.println("Turning on the Grills");
    }
}
