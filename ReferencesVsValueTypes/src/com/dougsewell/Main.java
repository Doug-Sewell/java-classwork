package com.dougsewell;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int myIntValue = 10;
	int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString((myIntArray)));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray= " + Arrays.toString((myIntArray)));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray= " + Arrays.toString((myIntArray)));
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
        /*
        You would think the above line would change the values, but it doesn't.
        This is because by using the "new" keyword, we are de-referencing the original
        address in memory. And these values are not printed to the console because in methods,
        you cannot change the address in memory. Only de-reference it. Thus, the array in the
        method is pointing to a new address in memory while the original two arrays in the
        main method are still pointing to their original reference.
         */
    }
}
