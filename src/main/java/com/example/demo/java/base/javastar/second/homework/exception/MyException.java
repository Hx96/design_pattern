package com.example.demo.java.base.javastar.second.homework.exception;

/**
 * @author 80307094
 */
public class MyException extends Exception {
    private Integer code;

    private String message;

    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
