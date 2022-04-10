package smart.oven.micronaut.m3.qualifiers;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import smart.oven.micronaut.m3.qualifiers.models.CookingMode;
import smart.oven.micronaut.m3.qualifiers.models.GrillCookingMode;

public class Oven {

    private CookingMode cookingMode;

//      @Inject
//    public Oven(CookingMode cookingMode){
//        this.cookingMode = cookingMode;
//    }
//    @Inject
//    public Oven(GrillCookingMode cookingMode) {
//        this.cookingMode = cookingMode;
//    }

//    @Inject
//    public Oven(@Named("Fan") CookingMode cookingMode) {
//        this.cookingMode = cookingMode;
//    }

    @Inject
    public Oven(@Defrosting CookingMode cookingMode) {
        this.cookingMode = cookingMode;
    }

    public void setCookingMode() {
        cookingMode.setCookingMode();
    }

}
