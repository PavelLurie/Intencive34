package ru.aston.lurie_pa.task10.lazy;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class ComponentA {
    private ComponentB componentB;

    @Autowired
    public ComponentA(ComponentB componentB) {
        this.componentB = componentB;
    }

    public void text(){
        System.out.println("Class ComponentA");
    }
}
