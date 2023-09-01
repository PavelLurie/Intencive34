package ru.aston.lurie_pa.task2;

public class PriceAboveZeroException extends Exception{
    /**
     Code 1 ошибка - нулевая цена.
     */
    private int code;

    public PriceAboveZeroException(String message, int code) {
        super(message);
        this.code = code;
    }
}
