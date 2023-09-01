package ru.aston.lurie_pa.task2;

public class SomeException extends Exception{
    /**
     @Param code 1 ошибка - нулевая цена.
     */
    private int code;

    public SomeException(String message, int code) {
        super(message);
        this.code = code;
    }
}
