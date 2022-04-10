package smart.oven.micronaut.m3.Introspection;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Meal {
    private String name;
    private Integer econdsToCook;
    private Integer temp;

    public Meal(String name, Integer secondsToCook, Integer temp){
        this.name = name;
        this.econdsToCook = secondsToCook;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEcondsToCook() {
        return econdsToCook;
    }

    public void setEcondsToCook(Integer econdsToCook) {
        this.econdsToCook = econdsToCook;
    }

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }
}
