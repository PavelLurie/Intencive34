package ru.aston.lurie_pa.task1;

import java.math.BigDecimal;

public class ClassicHaircut extends HaircutOrder{
    private BigDecimal coefficient;
    private HairLength hairLength;

    public ClassicHaircut(BigDecimal multiplyingFactor, BigDecimal price, User user, int id, BigDecimal coefficient, HairLength hairLength) {
        super(multiplyingFactor, price, user, id);
        this.coefficient = coefficient;
        this.hairLength = hairLength;
    }

    @Override
    public BigDecimal getMultiplyingFactor() {
        return super.getMultiplyingFactor().multiply(coefficient);
    }
}
