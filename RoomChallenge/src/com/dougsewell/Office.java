package com.dougsewell;

public class Office {
    private boolean window;
    private Desk desk;
    private Mug mug;
    private PC pc;

    public Office(boolean window, Desk desk, Mug mug, PC pc) {
        this.window = window;
        this.desk = desk;
        this.mug = mug;
        this.pc = pc;
    }

    public void getSpecs() {
        pc.listSpecs();
    }

    public Mug getMug() {
        return mug;
    }
}
