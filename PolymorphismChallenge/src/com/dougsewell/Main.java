package com.dougsewell;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void accelerate() {
        System.out.println("Accelerating.");
    }

    public void braking() {
        System.out.println("Car is slowing down.");
    }

    public void lowerTemperature() {
        System.out.println("Lowering temperature.");
    }
}

class Nissan extends Car {
    public Nissan(int cylinders, String name) {
        super(cylinders,name);
    }

    @Override
    public void startEngine() {
        System.out.println("The Nissan's engine has started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Nissan is accelerating.");
    }

    @Override
    public void braking() {
        System.out.println("Nissan is braking.");
    }
}

class Honda extends Car {
    public Honda(int cylinders, String name) {
        super(cylinders,name);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda engine has started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda has accelerated.");
    }

    @Override
    public void braking() {
        System.out.println("Honda is braking.");
    }
}

class Subaru extends Car {
    public Subaru(int cylinders,String name) {
        super(cylinders,name);
    }

    @Override
    public void startEngine() {
        System.out.println("Subaru has started.");
    }

    @Override
    public void accelerate() {
        System.out.println("Subaru is accelerating.");
    }

    @Override
    public void braking() {
        System.out.println("Subaru is braking.");
    }
}











public class Main {

    public static void main(String[] args) {
        Honda myHonda = new Honda(6,"CRV)");
        Nissan myNissan = new Nissan(4,"Note");
        Subaru mySubaru = new Subaru(7,"Outback");

        mySubaru.accelerate();
        myNissan.braking();
        myHonda.startEngine();
        System.out.println("My Nissan has an engine:" + myNissan.isEngine());
        myHonda.lowerTemperature();



    }
}
