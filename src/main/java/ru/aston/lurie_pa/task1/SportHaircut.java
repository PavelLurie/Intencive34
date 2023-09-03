package ru.aston.lurie_pa.task1;

import ru.aston.lurie_pa.task2.PriceAboveZeroException;

import java.math.BigDecimal;

public class SportHaircut extends HaircutOrder {
    private BigDecimal coefficient;

    public SportHaircut(BigDecimal multiplyingFactor, BigDecimal price, User user, int id, BigDecimal coefficient) throws PriceAboveZeroException {
        super(multiplyingFactor, price, user, id);
        this.coefficient = coefficient;
    }

    @Override
    public BigDecimal getMultiplyingFactor() {
        return super.getMultiplyingFactor().multiply(coefficient);
    }
}
