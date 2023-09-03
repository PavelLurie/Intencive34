package ru.aston.lurie_pa.task2;

public enum CodeError {
    CODE_PRICE_ERROR(1);
    private final int codeError;

    CodeError(int codeError) {
        this.codeError = codeError;
    }

    public int getCodeError() {
        return codeError;
    }
}
