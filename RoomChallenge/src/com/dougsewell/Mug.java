package com.dougsewell;

public class Mug {
    private boolean isDecorated;
    private String color;
    private String filledWith;

    public Mug(boolean isDecorated, String color, String filledWith) {
        this.isDecorated = isDecorated;
        this.color = color;
        this.filledWith = filledWith;
    }

    public void getMugDetails() {
        String mugDetails = "The mug is";

        if(isDecorated) {
            mugDetails += " decorated.";
        } else {
            mugDetails += " not decorated.";
        }

        mugDetails += " The main color is " + color + ". It is filled with " + filledWith + ".";

        System.out.println(mugDetails);
    }
}
