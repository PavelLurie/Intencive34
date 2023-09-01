package ru.aston.lurie_pa.task1;

import ru.aston.lurie_pa.task2.SomeException;

import java.math.BigDecimal;

public abstract class HaircutOrder implements MultiplyingFactor, Comparable<HaircutOrder>{
    private BigDecimal multiplyingFactor;
    private BigDecimal price;
    private User user;
    private int id;

    public HaircutOrder() {
    }

    public HaircutOrder(BigDecimal multiplyingFactor, BigDecimal price, User user, int id) {
        this.multiplyingFactor = multiplyingFactor;
        this.price = price;
        this.user = user;
        this.id = id;
    }

    @Override
    public BigDecimal getMultiplyingFactor() {
        return multiplyingFactor;
    }

    public void setMultiplyingFactor(BigDecimal multiplyingFactor) {
        this.multiplyingFactor = multiplyingFactor;
    }


    public BigDecimal getPrice() throws SomeException {
        if (price.compareTo(new BigDecimal(0)) <= 0){
            throw new SomeException("Цена не может быть меньше или равна нулю", 1);
        }
        return this.price.multiply(getMultiplyingFactor());
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HaircutOrder{" +
                "multiplyingFactor=" + multiplyingFactor +
                ", price=" + price +
                ", user=" + user +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(HaircutOrder haircutOrder) {
        return user.getSourName().compareTo(haircutOrder.user.getSourName());
    }
}
