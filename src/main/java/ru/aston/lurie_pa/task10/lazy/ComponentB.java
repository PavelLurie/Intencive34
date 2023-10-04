package ru.aston.lurie_pa.task10.lazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ComponentB {
    private ComponentA componentA;

    @Autowired
    public ComponentB(@Lazy ComponentA componentA) {
        this.componentA = componentA;
    }

    public void text(){
        System.out.println("Class ComponentB");
    }
}
