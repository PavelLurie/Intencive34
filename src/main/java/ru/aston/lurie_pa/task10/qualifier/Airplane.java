package ru.aston.lurie_pa.task10.qualifier;

import org.springframework.stereotype.Component;

@Component
public class Airplane implements Flying{
    @Override
    public void fly() {
        System.out.println("Самолет совершает перелет из СПб в Новосибирск");
    }
}
