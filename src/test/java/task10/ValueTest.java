package task10;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aston.lurie_pa.task10.value.SomeComponent;
import ru.aston.lurie_pa.task10.value.SpringConfigValue;

public class ValueTest {
    private static final Logger log = LoggerFactory.getLogger(ValueTest.class);
    private static final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigValue.class);

    @Test
    void someComponentTest(){
        SomeComponent someComponent = context.getBean(SomeComponent.class);
        System.out.println(someComponent.getSum());
    }
}
