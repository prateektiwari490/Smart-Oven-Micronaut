package smart.oven.micronaut.m3.qualifiers.models;

import jakarta.inject.Singleton;

@Singleton
public class GrillCookingMode implements CookingMode {
    @Override
    public void setCookingMode() {
        System.out.println("Setting Grill Cooking Mode");
    }
}
