package smart.oven.micronaut.m3.scopes;

import jakarta.inject.Singleton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Singleton
public class Lights {
    public Lights(){
        System.out.println("Calling the Lights Constructor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Calling Lights @PostConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Calling Lights @PreDestroy");
    }
}
