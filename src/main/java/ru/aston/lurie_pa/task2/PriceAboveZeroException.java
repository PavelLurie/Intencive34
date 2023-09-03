package ru.aston.lurie_pa.task2;

public class PriceAboveZeroException extends Exception{

    private final CodeError codeError;
    public PriceAboveZeroException(String message, CodeError codeError) {
        super(message);
        this.codeError = codeError;
    }

    public CodeError getCodeError() {
        return codeError;
    }
}
