package org.example;

public interface ISwim {
    default void swim(){
        System.out.println("I swim like a duck !");
    }
}
