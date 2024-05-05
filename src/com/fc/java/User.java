package com.fc.java;

abstract public class User {
    private String name;
    private char sex;
    private String place;

    public void move() {
        System.out.println("move to ");
    }

    abstract public void process();
}
