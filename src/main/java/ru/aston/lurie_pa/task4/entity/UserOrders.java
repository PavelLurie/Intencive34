package ru.aston.lurie_pa.task4.entity;

public class UserOrders {
    private long id;
    private String fio;
    private String productName;
    private String dataOrder;
    private String shipperName;

    public UserOrders(long id, String fio, String productName, String dataOrder, String shipperName) {
        this.id = id;
        this.fio = fio;
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

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
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
        return "UserOrders{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", productName='" + productName + '\'' +
                ", dataOrder='" + dataOrder + '\'' +
                ", shipperName='" + shipperName + '\'' +
                '}';
    }
}
