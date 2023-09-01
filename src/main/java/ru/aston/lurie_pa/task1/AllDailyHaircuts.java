package ru.aston.lurie_pa.task1;



import ru.aston.lurie_pa.task2.SomeException;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public class AllDailyHaircuts implements OrderCalculation{
    private BigDecimal resultSum;
    private List<HaircutOrder> orderList;

    public AllDailyHaircuts(List<HaircutOrder> orderList) {
        this.orderList = orderList;
    }

    public List<HaircutOrder> getSortedList(){
        Collections.sort(orderList);
        return this.orderList;
    }

    @Override
    public BigDecimal calcDailyPrice() {
        resultSum = BigDecimal.ZERO;
        for (HaircutOrder haircutOrder : this.orderList){
            try {
                resultSum = resultSum.add(haircutOrder.getPrice());
            } catch (SomeException e) {
                throw new RuntimeException(e);
            }
        }
        return resultSum;
    }

    @Override
    public String toString() {
        return "DailyOrderList{" +
                ", orderList=" + orderList +
                '}';
    }
}
