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
            System.out.println("Enter your choice: ");
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
                    System.out.println("Thank you and see you again! ");
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
        System.out.println("Please enter grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem((itemNo - 1), newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        String itemRemoved = groceryList.removeGroceryItem((itemNo - 1));
        System.out.printf("%s has been removed from the grocery list. \n", itemRemoved);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String itemToSearch = scanner.nextLine();
        String item = groceryList.findItem(itemToSearch);
        if (null != item) {
            System.out.printf("%s is in the grocery list. ", item);
        } else {
            System.out.printf("%s is not found in the grocery list. \n", itemToSearch);
        }
    }
}