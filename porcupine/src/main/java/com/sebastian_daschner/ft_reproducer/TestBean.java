package com.sebastian_daschner.ft_reproducer;

public class TestBean {

    public String someString() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Hello";
    }

    public String anotherString() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "World";
    }

}
