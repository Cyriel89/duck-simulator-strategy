package org.example;

public abstract class Duck implements ISwim {
    private final String color;
    private final int wingsnumber;

    protected Duck(String color, int wingsnumber) {
        this.color = color;
        this.wingsnumber = wingsnumber;
    }

    public String getColor() {
        return color;
    }

    public int getWingsnumber() {
        return wingsnumber;
    }
}
