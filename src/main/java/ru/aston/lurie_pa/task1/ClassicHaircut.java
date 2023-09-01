package ru.aston.lurie_pa.task1;

import ru.aston.lurie_pa.task2.SomeException;

import java.math.BigDecimal;

public class ClassicHaircut extends HaircutOrder{
    private BigDecimal coefficient;
    private HairLength hairLength;

    public ClassicHaircut(BigDecimal multiplyingFactor, BigDecimal price, User user, int id, BigDecimal coefficient, HairLength hairLength) throws SomeException {
        super(multiplyingFactor, price, user, id);
        this.coefficient = coefficient;
        this.hairLength = hairLength;
    }

    @Override
    public BigDecimal getMultiplyingFactor() {
        return super.getMultiplyingFactor().multiply(coefficient);
    }
}
