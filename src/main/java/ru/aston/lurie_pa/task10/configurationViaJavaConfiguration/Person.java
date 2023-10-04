package ru.aston.lurie_pa.task10.configurationViaJavaConfiguration;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {
    @PostConstruct
    public void init(){
        System.out.println("Сработал init-method бина person");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Сработал destroy-method бина person");
    }
}
