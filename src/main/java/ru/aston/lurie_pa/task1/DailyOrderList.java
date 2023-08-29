package ru.aston.lurie_pa.task1;

import com.sun.tools.javac.util.List;

import java.math.BigDecimal;


//повесить тест
public class DailyOrderList implements OrderCalculation{
    private final BigDecimal INIT_SUMM;
    private List<HaircutOrder> orderList;

    public DailyOrderList(BigDecimal initSumm, List<HaircutOrder> orderList) {
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
}
