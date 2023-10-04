package task10;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aston.lurie_pa.task10.qualifier.Bird;
import ru.aston.lurie_pa.task10.qualifier.SpringConfigQualifier;

public class QualifierTest {
    private static final Logger log = LoggerFactory.getLogger(ConfigurationViaXMLTest.class);
    private static final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigQualifier.class);

    @Test
    void birdTest(){
        Bird bird = context.getBean(Bird.class);
        bird.fly();
        log.trace(bird.toString());
    }
}

