package smart.oven.micronaut.m3;

import io.micronaut.core.beans.BeanIntrospection;
import io.micronaut.core.beans.BeanProperty;
import smart.oven.micronaut.m3.Introspection.Meal;

public class IntrospectionApplication {
    public static void main(String[] args) {
        BeanIntrospection<Meal> introspection = BeanIntrospection.getIntrospection(Meal.class);

        Meal meal = introspection.instantiate("Pizza",600,400);
        System.out.println("Cooking : " + meal.getName());

        BeanProperty<Meal, String> mealName = introspection.getRequiredProperty("name", String.class);
        mealName.set(meal, "pasta");
        System.out.println("Cooking : " + meal.getName());
    }
}
