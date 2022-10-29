package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>(); // defining new array list

    /* Add to the list */
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    /* Print the list */
    public void printGroceryList() {
        //size() - how many elements are stored in the array list
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            // i+1 - our counting starts with 1
            // .get - to access particular element
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    /* modify/update an item */
    public void modifyGroceryItem(int position, String newItem) {
        //replace the item at that location
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    /* Remove an item */
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position); // retrieve the item first
        groceryList.remove(position);
    }

    /* Find the items */
    // search for that string in our array list
    public String findItem(String searchItem) {
        // using contains function - to do fast search for us
//        boolean exists = groceryList.contains(searchItem); // contains- check to see if this list contains specified element
        //indexOf - Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
