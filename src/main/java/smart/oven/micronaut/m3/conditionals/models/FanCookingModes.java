package smart.oven.micronaut.m3.conditionals.models;

import jakarta.inject.Singleton;

@Singleton
public class FanCookingModes implements CookingModes {
    @Override
    public void setCookingMode() {
        System.out.println("Setting Fan Cooking Mode");
    }
}