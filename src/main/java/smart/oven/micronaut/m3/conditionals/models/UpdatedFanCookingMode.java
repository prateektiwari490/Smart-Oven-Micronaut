package smart.oven.micronaut.m3.conditionals.models;

import io.micronaut.context.annotation.Replaces;
import jakarta.inject.Singleton;

@Singleton
@Replaces(FanCookingModes.class)
public class UpdatedFanCookingMode implements CookingModes {
    @Override
    public void setCookingMode() {
        System.out.println("Setting Updated Fan Cooking Mode");
    }
}