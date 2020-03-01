package com.dougsewell;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list.");
        for(int x = 0; x < groceryList.size(); x++) {
            System.out.println((x + 1) + ". " + groceryList.get(x));
        }
    }


    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position,newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0 ) {
            removeGroceryItem(position);
        }

    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return (position >= 0);

    }

    private int findItem(String searchItem) {

        //boolean exists = groceryList.contains(searchItem); //Returns true or false if a value is in the ArrayList.

        /*int position = groceryList.indexOf(searchItem); //Returns the index of that item. Returns -1 if it doesn't exist.
        if(position >= 0) {
            return groceryList.get(position);
        } else {
            return null;
        }
        */
        return groceryList.indexOf(searchItem);
    }
}
