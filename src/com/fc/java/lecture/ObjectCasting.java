package com.fc.java.lecture;

public class ObjectCasting {
    String name = null;
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

        ani.walk();

        Cat cat = (Cat) ani;
        cat.walk();
        cat.night();

//        System.out.println(name);
    }
}
