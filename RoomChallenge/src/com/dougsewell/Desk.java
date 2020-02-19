package com.dougsewell;

public class Desk {
    private String color;
    private String material;
    private int size;

    public Desk(String color, String material, int size) {
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }
}
