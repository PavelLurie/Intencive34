import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aston.lurie_pa.task1.*;
import ru.aston.lurie_pa.task2.SomeException;

import java.math.BigDecimal;

public class SomeExceptionTest {
    @Test
    void calcDailyPriceTest() throws SomeException {
        User user = new User(54, "Smith", "Mike");

        HaircutOrder haircutOrder = new ClassicHaircut(new BigDecimal("1.5"), new BigDecimal(-20), user, 1, new BigDecimal("0.2"), HairLength.SHORT_HAIR);

        Assertions.assertThrows(SomeException.class, haircutOrder::getPrice);
    }
}
