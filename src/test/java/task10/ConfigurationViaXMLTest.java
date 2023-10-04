package task10;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aston.lurie_pa.task10.configurationViaXML.Animal;
import ru.aston.lurie_pa.task10.configurationViaXML.Pet;

public class ConfigurationViaXMLTest {
    private static final Logger log = LoggerFactory.getLogger(ConfigurationViaXMLTest.class);
    private static final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    void AnimalTest(){
        Animal animal = context.getBean(Animal.class);
        Animal animal1 = context.getBean(Animal.class);
        animal.destroy();
        log.trace(animal.toString());

    }

    @Test
    void PetTest(){
        Pet pet = context.getBean(Pet.class);
        pet.destroy();

        Pet pet1 = context.getBean(Pet.class);
        log.trace(pet.toString());
    }
}
