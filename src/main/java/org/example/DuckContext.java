package org.example;

public class DuckContext {
    private ISwimBehavior duck;

    public DuckContext(ISwimBehavior duck) {
        this.duck = duck;
    }

    public void swim(){
        this.duck.swimbehavior();
    }
}
