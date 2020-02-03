package com.dougsewell;

public class Main {

    public static void main(String[] args) {
        numberToWords(-222);
        numberToWords(123456789);
    }

    public static void numberToWords(int number) {
        if (number < 0 ) {
            System.out.println("Invalid Value");
        } else {
            int digitCount = getDigitCount(number);

            number = reverse(number);

            String numString = "";
            int characterCount = 0;

            while(number > 0) {
                int currentNum = number % 10;
                number /= 10;
                characterCount++;

                if(numString != "") {
                    numString += " ";

                }
                switch(currentNum) {
                    case 0:
                        numString += "Zero";
                        break;
                    case 1:
                        numString += "One";
                        break;
                    case 2:
                        numString += "Two";
                        break;
                    case 3:
                        numString += "Three";
                        break;
                    case 4:
                        numString += "Four";
                        break;
                    case 5:
                        numString += "Five";
                        break;
                    case 6:
                        numString += "Six";
                        break;
                    case 7:
                        numString += "Seven";
                        break;
                    case 8:
                        numString += "Eight";
                        break;
                    case 9:
                        numString += "Nine";
                        break;
                    default:
                        numString += "ERROR";
                        break;
                }
            }


            while(characterCount != digitCount) {
                numString += " Zero";
                characterCount++;
            }
            System.out.println(numString);
        }
    }


    public static int reverse(int number) {
        int newNum = 0;
        boolean isNegative = false;

        if(number < 0) {
            number *= -1;
            isNegative = true;
        }

        while(number > 0) {
            int currentDigit = number % 10;
            number /= 10;

            newNum = currentDigit + (newNum*10);
        }

        if(isNegative) {
            newNum *= -1;
        }
        return newNum;
    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        } else if(number == 0) {
            return 1;
        }

        int counter = 0;

        while(number > 0) {
            counter ++;
            number /= 10;
        }
        return counter;
    }
}
