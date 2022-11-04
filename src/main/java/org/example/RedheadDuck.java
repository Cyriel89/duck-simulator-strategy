package org.example;

public class RedheadDuck extends Duck{

    @Override
    public void swim() {

    }

    @Override
    public void display() {
        super.display();
        System.out.println("But a Red head");
    }

    @Override
    public void quack() {
        super.quack();
        System.out.println("Queck");
    }

    @Override
    public void fly() {
        super.fly();
    }
}
