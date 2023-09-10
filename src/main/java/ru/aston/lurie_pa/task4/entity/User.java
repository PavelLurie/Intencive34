package ru.aston.lurie_pa.task4.entity;

public class User {
    private long id;
    private String fio;
    private String phone;
    private String email;
    private long orderId;

    public User() {
    }

    public User(long id, String fio, String phone, String email, long orderId) {
        this.id = id;
        this.fio = fio;
        this.phone = phone;
        this.email = email;
        this.orderId = orderId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}
