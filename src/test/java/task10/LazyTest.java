package task10;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aston.lurie_pa.task10.lazy.ComponentB;
import ru.aston.lurie_pa.task10.lazy.SpringConfigLazy;

public class LazyTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigLazy.class);

    @Test
    void ComponentBTest(){
        ComponentB componentB = context.getBean(ComponentB.class);
        componentB.text();
    }
}
