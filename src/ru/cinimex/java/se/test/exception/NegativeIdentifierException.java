package ru.cinimex.java.se.test.exception;

public class NegativeIdentifierException extends Exception {
    public NegativeIdentifierException() {
    }

    public NegativeIdentifierException(String message) {
        super(message);
    }

    public NegativeIdentifierException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeIdentifierException(Throwable cause) {
        super(cause);
    }

    public NegativeIdentifierException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
