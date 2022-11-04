package org.example;

public class Main {
    public static void main(String[] args) {
        DuckContext d = new DuckContext((ISwimBehavior) new MallardDuck());
        d.swim();

        d = new DuckContext(new RedheadDuck());
        d.swim();
    }
}