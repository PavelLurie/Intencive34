package ru.aston.lurie_pa.task1;

import com.sun.tools.javac.util.List;

import java.math.BigDecimal;
import java.util.ArrayList;

public class AllDailyHaircuts implements OrderCalculation{
    private final BigDecimal INIT_SUMM;
    private List<HaircutOrder> orderList;

    public AllDailyHaircuts(BigDecimal initSumm, List<HaircutOrder> orderList) {
        INIT_SUMM = initSumm;
        this.orderList = orderList;
    }

    @Override
    public BigDecimal calcDailyPrice(BigDecimal counter) {
        return null;
    }



    @Override
    public String toString() {
        return "DailyOrderList{" +
                "INIT_SUMM=" + INIT_SUMM +
                ", orderList=" + orderList +
                '}';
    }

    public static void main(String[] args) {
        User user = new User(25, "Smith", "Mike");
        HaircutOrder haircutOrder = new ClassicHaircut(BigDecimal.valueOf(1.4), BigDecimal.valueOf(1500), user, 2, BigDecimal.valueOf(0.2));
        ArrayList<HaircutOrder> tempList = new ArrayList<>();
        //AllDailyHaircuts allDailyHaircuts = new AllDailyHaircuts();

    }
}
