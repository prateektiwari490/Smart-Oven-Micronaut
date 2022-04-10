package smart.oven.micronaut.m3.conditionals;

import io.micronaut.context.annotation.Requires;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import smart.oven.micronaut.m3.conditionals.models.CookingModes;

@Singleton
@Requires(property = "safety.switch.enabled", value = "true")
public class ConditionalOven {

    private CookingModes cookingMode;

    @Inject
    public ConditionalOven(CookingModes cookingMode) {
        this.cookingMode = cookingMode;
    }

    public void setCookingMode() {
        cookingMode.setCookingMode();
    }
}