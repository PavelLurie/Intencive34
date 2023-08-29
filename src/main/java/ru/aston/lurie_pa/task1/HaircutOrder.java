package ru.aston.lurie_pa.task1;

import java.math.BigDecimal;

public abstract class HaircutOrder implements Discount{
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

    public BigDecimal getPrice() {
        return price;
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

    public BigDecimal getHaircutPrice(){
        return null;
    }
}
