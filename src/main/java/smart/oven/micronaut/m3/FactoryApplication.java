package smart.oven.micronaut.m3;

import io.micronaut.context.ApplicationContext;
import smart.oven.micronaut.m3.factory.CombiOven;

public class FactoryApplication {
    public static void main(String[] args) {
        ApplicationContext appContext = ApplicationContext.run();

        CombiOven combiOven = appContext.getBean(CombiOven.class);

        combiOven.turnOnMicrowave();
    }
}
