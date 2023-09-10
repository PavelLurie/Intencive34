package ru.aston.lurie_pa.task4.entity;

public class Order {
    private long id;
    private String productName;
    private String dataOrder;
    private String shipperName;

    public Order() {
    }

    public Order(long id, String productName, String dataOrder, String shipperName) {
        this.id = id;
        this.productName = productName;
        this.dataOrder = dataOrder;
        this.shipperName = shipperName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDataOrder() {
        return dataOrder;
    }

    public void setDataOrder(String dataOrder) {
        this.dataOrder = dataOrder;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", dataOrder='" + dataOrder + '\'' +
                ", shipperName='" + shipperName + '\'' +
                '}';
    }
}
