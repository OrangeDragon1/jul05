package udemy.section08;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Bye bye! ");
                    break;
                default:
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Available options: ");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of grocery items.");
        System.out.println("\t2 - To add an item to the list.");
        System.out.println("\t3 - To modify an item in the list.");
        System.out.println("\t4 - To remove an item from the list.");
        System.out.println("\t5 - To search for an item in the list.");
        System.out.println("\t6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item to replace: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void removeItem() {
        // System.out.println("Enter item number: ");
        // int itemNo = scanner.nextInt();
        System.out.print("Enter item: ");
        String itemRemoved = groceryList.removeGroceryItem((scanner.nextLine()));
        System.out.printf("%s has been removed from the grocery list. \n", itemRemoved);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String itemToSearch = scanner.nextLine();
        // int itemIndex = groceryList.findItem(itemToSearch);
        if (groceryList.onFile(itemToSearch)) {
            System.out.printf("%s is in the grocery list. \n", itemToSearch);
        } else {
            System.out.printf("%s is not found in the grocery list. \n", itemToSearch);
        }
    }
}
