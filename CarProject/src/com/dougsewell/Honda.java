package com.dougsewell;

public class Honda extends Car {

    private boolean heatedSeat;

    public Honda(int steering, int gears, int speed, boolean heatedSeat) {
        super(steering, gears, speed);
        this.heatedSeat = heatedSeat;
    }

    public Honda(int steering, int gears, int speed) {
        this(steering, gears, speed, true);
    }

    public void setHeatedSeat(boolean heatedSeat) {
        this.heatedSeat = heatedSeat;
    }

    public boolean isHeatedSeat() {
        return heatedSeat;
    }
}
