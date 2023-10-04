package ru.aston.lurie_pa.task10.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Bird implements Flying{
    @Override
    public void fly() {
        System.out.println("Птицы перелетают с места на место");
    }
}
