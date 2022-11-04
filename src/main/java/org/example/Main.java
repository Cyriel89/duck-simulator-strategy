package org.example;

public class Main {
    public static void main(String[] args) {
       Duck mallard = new MallardDuck();
       Duck red = new RedheadDuck();

       mallard.display();
       red.fly();
       red.display();
    }
}