package smart.oven.micronaut.m3.scopes;

import io.micronaut.http.annotation.RequestAttribute;
import jakarta.inject.Singleton;

@Singleton
public class Oven1 {

    private Lights lights;

    public Oven1(Lights lights){
        System.out.println("Calling Oven1 Constructor");
        this.lights = lights;
    }

    public void turnOn(@RequestAttribute("accept-language") String language){
        System.out.println(language);
        System.out.println("Turning on the Oven1");
    }

}
