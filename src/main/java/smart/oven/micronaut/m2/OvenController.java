package smart.oven.micronaut.m2;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class OvenController {

    @Get("/status/{ovenId}")
    public String getStatusOvenId(String ovenId){
        return "OK";
    }
}
