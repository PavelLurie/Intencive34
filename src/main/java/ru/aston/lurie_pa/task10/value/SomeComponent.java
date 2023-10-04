package ru.aston.lurie_pa.task10.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class SomeComponent {
    private static final Logger log = LoggerFactory.getLogger(SomeComponent.class);
    @Value("${a}")
    private int a;

    @Value("${b}")
    private int b;

    public int getSum(){
        int c = a + b;
        log.trace(String.valueOf(c));
        return c;
    }
}
