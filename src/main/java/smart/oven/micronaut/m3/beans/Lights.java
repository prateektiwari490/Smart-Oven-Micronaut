package smart.oven.micronaut.m3.beans;

import jakarta.inject.Singleton;

@Singleton
public class Lights {
    public void turnOn(){
        System.out.println("Turning on the Lights");
    }
}
