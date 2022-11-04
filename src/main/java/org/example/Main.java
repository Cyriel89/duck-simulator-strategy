package org.example;

public class Main {
    public static void main(String[] args) {
        DuckContext d = new DuckContext(new MallardDuck());
        d.swim();
    }
}