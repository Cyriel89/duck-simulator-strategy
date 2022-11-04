package org.example;

public class MallardDuck extends Duck{
    @Override
    public void swim() {
        System.out.println("I swim like a swan");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("But a Mallard");
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void quack() {
        super.quack();
        System.out.println("Quack");
    }
}
