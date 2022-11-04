package org.example;

public interface IQuackBehavior {
    default void swimbehavior(){
        System.out.println("Coin-Coin");
    }
}
