package com.forty;

public class Excetp extends Exception{
    public Excetp() {
        super();
    }

    public Excetp(String message) {
        super(message);
    }

    public Excetp(String message, Throwable cause) {
        super(message, cause);
    }

    public Excetp(Throwable cause) {
        super(cause);
    }

    protected Excetp(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}