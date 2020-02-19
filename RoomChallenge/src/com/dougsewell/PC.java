package com.dougsewell;

public class PC {
    private boolean isLaptop;
    private boolean containsGPU;
    private int storage;
    private int ram;
    private String processor;

    public PC(boolean isLaptop, boolean containsGPU, int storage, int ram, String processor) {
        this.isLaptop = isLaptop;
        this.containsGPU = containsGPU;
        this.storage = storage;
        this.ram = ram;
        this.processor = processor;
    }
    public void listSpecs() {
        System.out.println(("Computer is a laptop: " + isLaptop));
        System.out.println("Computer contains a dedicated GPU: " + containsGPU);
        System.out.println("Computer contains " + storage + " GB of storage.");
        System.out.println(("Computer contains " + ram + " GB of RAM."));
        System.out.println("Computer uses a " + processor + " processor.");
    }
}
