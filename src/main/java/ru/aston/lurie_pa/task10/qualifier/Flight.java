package ru.aston.lurie_pa.task10.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flight {
    private Flying flying;

    @Autowired
    public Flight(@Qualifier("bird") Flying flying) {
        this.flying = flying;
    }

    public void getFly(){
        flying.fly();
    }
}
