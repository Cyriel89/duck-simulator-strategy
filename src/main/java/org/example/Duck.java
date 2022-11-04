package org.example;

public abstract class Duck {

    private ISwimBehavior swimBehavior;
    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;
    public void swim() {

    }
    public void fly(){
    }
    public void quack(){
    }
    public abstract void display();
}
