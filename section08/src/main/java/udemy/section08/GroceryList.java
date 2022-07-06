package udemy.section08;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.printf("You have %d items in your grocery list. \n", groceryList.size());
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.printf("%d. %s \n", (i + 1), groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        String prevItem = groceryList.get(position);
        groceryList.set(position, newItem);
        System.out.printf("%s has been changed to %s", prevItem, newItem);
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = findItem(oldItem.toLowerCase());
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        } else {
            System.out.printf("%s cannot be found. ", oldItem);
        }
    }

    private String removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        return theItem;
    }

    public String removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            String removedItem = removeGroceryItem(position);
            return removedItem;
        } else {
            return null;
        }

    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
        // boolean exists = groceryList.contains(searchItem);
        // int position = groceryList.indexOf(searchItem);
        // if (position >= 0) {
        // return groceryList.get(position);
        // }

        // return null;
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if (position >= 0) {
            return true;
        }
        return false;
    }
}
