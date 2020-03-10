package com.dougsewell;

import java.util.ArrayList;

class IntClass {
    private int myInt;

    public IntClass(int myInt) {
        this.myInt = myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public int getMyInt() {
        return myInt;
    }
}

public class Main {

    public static void main(String[] args) {
	int[] intArray = new int[10];
	String[] myStr = new String[5];
        ArrayList<String> myArrayList = new ArrayList<>();

        //Cannot pass primitive values for ArrayLists. Must pass a class. The following line returns an error.
        //ArrayList<int>myIntArrayList = new ArrayList<>();

        //The following three lines show how you can essentially wrap your code in a class to still use ArrayListss
        // and primitive types. The downside is that this is messy because while it works, we needed to create a
        //class which was a lot of work.
        ArrayList<IntClass> myIntArrayList = new ArrayList<>();
        myIntArrayList.add(new IntClass(5));
        System.out.println(myIntArrayList.get(0).getMyInt());


        //THe easier way of doing the above is using Java's built in Classes for primitive types.
        //This makes the wrapper we essentially did, but Java has it built in:
        /*
        ArrayList<Integer> myOtherIntArrayList = new ArrayList<Integer>();

        for(int i = 0; i <= 10; i++) {
            myOtherIntArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i < myOtherIntArrayList.size(); i++) {
            System.out.println(myOtherIntArrayList.get(i).intValue());
        }
        */
        //Another example:
        /*
        ArrayList<Double> myDoubleArrayList = new ArrayList<Double>();
        for(double x = 0.0; x <= 10.0; x+= 0.5) {
            myDoubleArrayList.add(Double.valueOf(x));
        }

        for(int x = 0; x < myDoubleArrayList.size(); x++) {
            System.out.println(myDoubleArrayList.get(x).doubleValue());
        }
        */

        //Forunately, there is an even easier way to do all the above examples as Java has some built in shortcuts.
        //It's just important to understand what is happening behind the scenes with your code.

        //Easy Example:
        ArrayList<Double> myEasyDoubleArrayList = new ArrayList<Double>();
        for(double x = 0.0; x <= 10; x+=0.5) {
            myEasyDoubleArrayList.add(x);
        }

        for(int x = 0; x < myEasyDoubleArrayList.size(); x++) {
            System.out.println(myEasyDoubleArrayList.get(x));
        }
    }
}
