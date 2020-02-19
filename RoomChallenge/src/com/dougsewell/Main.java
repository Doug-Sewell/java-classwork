package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        boolean window = true;
        Desk desk = new Desk("black", "wood", 12);
        Mug mug = new Mug(true,"white","coffee");
        PC pc = new PC(true,true,128,16,"Intel i7");
        Office office = new Office(true,desk,mug,pc);

        office.getSpecs();
        office.getMug().getMugDetails();
    }
}
