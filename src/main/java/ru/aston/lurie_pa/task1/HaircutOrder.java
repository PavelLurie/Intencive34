package ru.aston.lurie_pa.task1;

import java.math.BigDecimal;

public abstract class HaircutOrder implements Discount{
    private BigDecimal discount;
    private BigDecimal price;
    private User user;
    private int id;

    public HaircutOrder() {
    }

    public HaircutOrder(BigDecimal discount, BigDecimal price, User user, int id) {
        this.discount = discount;
        this.price = price;
        this.user = user;
        this.id = id;
    }



    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public BigDecimal getHaircutPrice(){
        return null;
    }
}
