package smart.oven.micronaut.m3;

import io.micronaut.context.BeanContext;
import smart.oven.micronaut.m3.qualifiers.Oven;

public class QualifiersApplication {
    public static void main(String[] args) {
        BeanContext context = BeanContext.run();
        Oven oven = context.getBean(Oven.class);
        oven.setCookingMode();
    }
}
