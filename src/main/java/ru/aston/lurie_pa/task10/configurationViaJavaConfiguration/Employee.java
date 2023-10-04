package ru.aston.lurie_pa.task10.configurationViaJavaConfiguration;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Employee {
    @PostConstruct
    public void init(){
        System.out.println("Сработал init-method бина employee");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Сработал destroy-method бина employee");
    }
}
