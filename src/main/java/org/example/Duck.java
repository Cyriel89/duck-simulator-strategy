package org.example;

public abstract class Duck implements ISwim {

    public void fly(){
        System.out.println("Fly me to the moon");
    }
    public void quack(){
        System.out.print("Coin-");
    }
    public void display(){
        System.out.println("I'm a duck");
    }
}
