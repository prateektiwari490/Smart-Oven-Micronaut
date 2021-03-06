package smart.oven.micronaut.m3;

import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.PropertySource;
import smart.oven.micronaut.m3.conditionals.ConditionalOven;

import static io.micronaut.core.util.CollectionUtils.mapOf;

public class ConditionalsApplication {
    public static void main(String[] args) {
        ApplicationContext appContext = ApplicationContext.run(
                PropertySource.of(
                        "default", mapOf("safety.switch.enabled", "true")));
        ConditionalOven oven = appContext.getBean(ConditionalOven.class);
        oven.setCookingMode();
    }
}
