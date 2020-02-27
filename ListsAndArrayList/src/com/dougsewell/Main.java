package com.dougsewell;

import java.util.ArrayList;

public class Main {
        private ArrayList<String> groceryList = new ArrayList<String>();

    public static void main(String[] args) {

    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for(int x = 0; x < groceryList.size(); x++) {
            System.out.println((x + 1) + ". " + groceryList.get(x));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public void removeGrocveryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Removed " + theItem);
    }
}
