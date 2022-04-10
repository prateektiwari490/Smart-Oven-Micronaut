package smart.oven.micronaut.m3.beans;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import smart.oven.micronaut.m3.beans.Grills;
import smart.oven.micronaut.m3.beans.Lights;

@Singleton
public class Oven {

//    @Inject
    private Lights lights;
//    @Inject
    private Grills grills;

    @Inject
    public Oven(Lights lights, Grills grills){
        this.lights = lights;
        this.grills = grills;
    }

//    public Oven() {}

    public void turnOn(){
        System.out.println("Turning on the Oven");
        lights.turnOn();
        grills.turnOn();
    }

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public Grills getGrills() {
        return grills;
    }

    public void setGrills(Grills grills) {
        this.grills = grills;
    }


}
