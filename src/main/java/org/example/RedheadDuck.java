package org.example;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new Flywithrocket();
        swimBehavior = new Swimlikeabrick();
        quackBehavior = new Quacklikeaboss();
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}
