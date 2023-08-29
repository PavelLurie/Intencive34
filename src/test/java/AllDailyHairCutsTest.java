import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.aston.lurie_pa.task1.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AllDailyHairCutsTest {

    @Test
    void calcDailyPriceTest(){
        User user = new User(54, "Smith", "Mike");
        User user1 = new User(23, "Doe", "John");

        HaircutOrder haircutOrder = new ClassicHaircut(BigDecimal.valueOf(1.5), BigDecimal.valueOf(1500), user, 1, BigDecimal.valueOf(0.2));
        HaircutOrder haircutOrder1 = new SportHaircut(BigDecimal.valueOf(1.5), BigDecimal.valueOf(1500), user1, 2, BigDecimal.valueOf(0.7));
        List<HaircutOrder> list = new ArrayList<>();
        list.add(haircutOrder);
        list.add(haircutOrder1);

        AllDailyHaircuts allDailyHaircuts = new AllDailyHaircuts(list);

        Assertions.assertEquals(new BigDecimal(2025), allDailyHaircuts.calcDailyPrice().stripTrailingZeros());
    }

    @Test
    void getSortedListTest(){
        User user = new User(54, "Smith", "Mike");
        User user1 = new User(23, "Doe", "John");

        HaircutOrder haircutOrder = new ClassicHaircut(BigDecimal.valueOf(1.5), BigDecimal.valueOf(1500), user, 1, BigDecimal.valueOf(0.2));
        HaircutOrder haircutOrder1 = new SportHaircut(BigDecimal.valueOf(1.5), BigDecimal.valueOf(1500), user1, 2, BigDecimal.valueOf(0.7));
        List<HaircutOrder> list = new ArrayList<>();
        list.add(haircutOrder);
        list.add(haircutOrder1);

        AllDailyHaircuts allDailyHaircuts = new AllDailyHaircuts(list);
        Assertions.assertNotEquals(allDailyHaircuts, allDailyHaircuts.getSortedList());
    }

}
