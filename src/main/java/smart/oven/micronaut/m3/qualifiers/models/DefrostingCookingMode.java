package smart.oven.micronaut.m3.qualifiers.models;

import jakarta.inject.Singleton;

@Singleton
public class DefrostingCookingMode implements CookingMode {
    @Override
    public void setCookingMode() {
        System.out.println("Setting Defrosting Cooking Mode");
    }
}
