package task10;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.aston.lurie_pa.task10.configurationViaJavaConfiguration.Employee;
import ru.aston.lurie_pa.task10.configurationViaJavaConfiguration.Person;
import ru.aston.lurie_pa.task10.configurationViaJavaConfiguration.SpringConfig;

public class ConfigurationViaJavaConfigurationTest {
    private static final Logger log = LoggerFactory.getLogger(ConfigurationViaJavaConfigurationTest.class);
    private static final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    @Test
    void personTest(){
        Person person = context.getBean(Person.class);
        person.destroy();
        log.trace(person.toString());
    }

    @Test
    void employeeTest(){
        Employee employee = context.getBean(Employee.class);
        employee.destroy();
        log.trace(employee.toString());
    }
}
