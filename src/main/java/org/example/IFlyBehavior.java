package org.example;

public interface IFlyBehavior {
    default void flybehavior(){
        System.out.println("I fly with my wings !");
    }
}
