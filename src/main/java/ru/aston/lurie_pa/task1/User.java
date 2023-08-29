package ru.aston.lurie_pa.task1;

import java.util.Objects;

public class User {
    private int age;
    private String sourName;
    private String name;

    public User(int age, String sourName, String name) {
        this.age = age;
        this.sourName = sourName;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(sourName, user.sourName) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, sourName, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", sourName='" + sourName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSourName() {
        return sourName;
    }

    public void setSourName(String sourName) {
        this.sourName = sourName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
