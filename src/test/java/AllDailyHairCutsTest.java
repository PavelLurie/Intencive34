import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aston.lurie_pa.task1.*;
import ru.aston.lurie_pa.task2.SomeException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AllDailyHairCutsTest {

    @Test
    void calcDailyPriceTest() throws SomeException {
        User user = new User(54, "Smith", "Mike");
        User user1 = new User(23, "Doe", "John");

        HaircutOrder haircutOrder = new ClassicHaircut(new BigDecimal("1.5"), new BigDecimal(1500), user, 1, new BigDecimal("0.2"), HairLength.SHORT_HAIR);
        HaircutOrder haircutOrder1 = new SportHaircut(new BigDecimal("1.5"), new BigDecimal(1500), user1, 2, new BigDecimal("0.7"));
        List<HaircutOrder> list = new ArrayList<>();
        list.add(haircutOrder);
        list.add(haircutOrder1);

        AllDailyHaircuts allDailyHaircuts = new AllDailyHaircuts(list);

        Assertions.assertEquals(new BigDecimal(2025), allDailyHaircuts.calcDailyPrice().stripTrailingZeros());
    }

    @Test
    void getSortedListTest() throws SomeException {
        User user = new User(54, "Smith", "Mike");
        User user1 = new User(23, "Doe", "John");

        HaircutOrder haircutOrder = new ClassicHaircut(new BigDecimal("1.5"), new BigDecimal(1500), user, 1, new BigDecimal("0.2"), HairLength.SHORT_HAIR);
        HaircutOrder haircutOrder1 = new SportHaircut(new BigDecimal("1.5"), new BigDecimal(1500), user1, 2, new BigDecimal("0.7"));
        List<HaircutOrder> list = new ArrayList<>();
        list.add(haircutOrder);
        list.add(haircutOrder1);

        AllDailyHaircuts allDailyHaircuts = new AllDailyHaircuts(list);
        Assertions.assertNotEquals(allDailyHaircuts, allDailyHaircuts.getSortedList());
    }

}
