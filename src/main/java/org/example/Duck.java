package org.example;

public abstract class Duck {
    protected ISwimBehavior swimBehavior;
    protected IFlyBehavior flyBehavior;
    protected IQuackBehavior quackBehavior;

    public void setSwimBehavior(ISwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        swimBehavior.swimbehavior();
    }
    public void fly(){
        flyBehavior.flybehavior();
    }
    public void quack(){
        quackBehavior.quackbehavior();
    }
    public abstract void display();
}
