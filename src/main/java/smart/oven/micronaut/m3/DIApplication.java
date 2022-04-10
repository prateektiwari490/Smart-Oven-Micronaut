package smart.oven.micronaut.m3;

import io.micronaut.context.BeanContext;
import smart.oven.micronaut.m3.beans.Oven;

public class DIApplication {
    public static void main(String[] args) {
//        Lights lights = new Lights();
//        Grills grills = new Grills();
//
//        Oven oven = new Oven(lights, grills);
//        oven.turnOn();

        BeanContext context = BeanContext.run();
        Oven oven = context.getBean(Oven.class);
        oven.turnOn();

    }
}
