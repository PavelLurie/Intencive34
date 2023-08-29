package ru.aston.lurie_pa.task1;

import java.math.BigDecimal;

public class SportHaircut extends HaircutOrder {
    private BigDecimal KOF;

    public SportHaircut(BigDecimal multiplyingFactor, BigDecimal price, User user, int id, BigDecimal KOF) {
        super(multiplyingFactor, price, user, id);
        this.KOF = KOF;
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().multiply(getMultiplyingFactor());
    }

    @Override
    public BigDecimal getMultiplyingFactor() {
        return KOF;
    }
}
