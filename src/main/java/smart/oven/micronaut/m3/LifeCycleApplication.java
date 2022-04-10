package smart.oven.micronaut.m3;

import io.micronaut.context.ApplicationContext;
import smart.oven.micronaut.m3.scopes.Oven1;
import smart.oven.micronaut.m3.scopes.Oven2;
import smart.oven.micronaut.m3.scopes.Oven3;

public class LifeCycleApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = ApplicationContext.run();
        System.out.println("Application Started");

        Oven1 oven1 = applicationContext.getBean(Oven1.class);
        Oven2 oven2 = applicationContext.getBean(Oven2.class);
        Oven3 oven3 = applicationContext.getBean(Oven3.class);

        oven1.turnOn("Hindi");
        oven2.turnOn();
        oven3.turnOn();

        applicationContext.stop();
    }
}
