package ru.aston.lurie_pa.task1;

import java.math.BigDecimal;

public class ClassicHaircut extends HaircutOrder{
    private BigDecimal KOF;

    public ClassicHaircut(BigDecimal multiplyingFactor, BigDecimal price, User user, int id, BigDecimal KOF) {
        super(multiplyingFactor, price, user, id);
        this.KOF = KOF;
    }

    @Override
    public BigDecimal getMultiplyingFactor() {
        return super.getMultiplyingFactor().multiply(KOF);
    }
}
