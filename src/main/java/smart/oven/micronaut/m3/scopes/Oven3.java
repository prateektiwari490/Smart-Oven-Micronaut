package smart.oven.micronaut.m3.scopes;

import jakarta.inject.Singleton;

@Singleton
public class Oven3 {
    private Lights lights;

    public Oven3(Lights lights){
        System.out.println("Calling Oven3 Constructor");
        this.lights = lights;
    }

    public void turnOn(){
        System.out.println("Turning on the Oven3");
    }
}
