import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aston.lurie_pa.task1.*;
import ru.aston.lurie_pa.task2.PriceAboveZeroException;

import java.math.BigDecimal;

public class PriceAboveZeroExceptionTest {

    @Test
    void setPriceTest() {
        HaircutOrder haircutOrder = new ClassicHaircut();
        Assertions.assertThrows(PriceAboveZeroException.class, () -> haircutOrder.setPrice(new BigDecimal(0)));
    }
}
