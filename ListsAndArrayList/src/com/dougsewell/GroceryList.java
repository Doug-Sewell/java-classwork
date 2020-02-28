package com.dougsewell;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();



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

    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem); //Returns true or false if a value is in the ArrayList.
        int position = groceryList.indexOf(searchItem); //Returns the index of that item. Returns -1 if it doesn't exist.
        if(position >= 0) {
            return groceryList.get(position);
        } else {
            return null;
        }
    }
}
