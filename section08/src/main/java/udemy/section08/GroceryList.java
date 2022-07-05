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

    public void modifyGroceryItem(int position, String newItem) {
        String prevItem = groceryList.get(position);
        groceryList.set(position, newItem);
        System.out.printf("%d. %s >> %s", (position + 1), prevItem, newItem);
    }

    public String removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        return theItem;
    }

    public String findItem(String searchItem) {
        // boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }

        return null;
    }
}
