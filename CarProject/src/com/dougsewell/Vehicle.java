package com.dougsewell;

public class Vehicle {
    private int steering;
    private int gears;
    private int speed;

    public Vehicle(int steering, int gears, int speed) {
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSteering() {
        return steering;
    }

    public int getGears() {
        return gears;
    }

    public int getSpeed() {
        return speed;
    }
}
