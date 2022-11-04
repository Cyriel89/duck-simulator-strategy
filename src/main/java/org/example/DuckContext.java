package org.example;

public class DuckContext {
    private ISwim duck;

    public DuckContext(ISwim duck) {
        this.duck = duck;
    }

    public void swim(){
        this.duck.swim();
    }
}
