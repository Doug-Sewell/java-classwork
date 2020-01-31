package com.dougsewell;

public class Main {

    public static void main(String[] args) {
//    int value = 1;
//    if(value == 1) {
//        System.out.println("Value was 1");
//    } else if (value == 2) {
//        System.out.println("Value was 2");
//    } else {
//        System.out.println("Was not 1 or 2");
//    }

    int switchValue = 3;

    switch(switchValue) {
        case 1:
            System.out.println(("Value was 1"));
            break;

        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Was a 3, or a 4, or a 5");
            System.out.println("Actually it was a " + switchValue);
            break;

        default:
            System.out.println("Was not 1 or 2");
            break;
    }

    char charVal = 'A';

    switch(charVal) {
        case 'A':
            System.out.println("Letter was A");
            break;
        case 'B':
            System.out.println("Letter was B");
            break;
            case 'C':
            System.out.println("Letter was C");
            break;
            case 'D':
            System.out.println("Letter was D");
            break;
            case 'E':
            System.out.println("Letter was E");
            break;
        default:
            System.out.println("Not found");
    }

    String month = "january";

    switch(month.toUpperCase()){
            case "JANUARY":
                System.out.println("January");
                break;
            default:
                System.out.println("Some other month");
                break;
        }

    }
}
