package com.crooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<InventoryItem> itemList = new ArrayList<InventoryItem>();

//        HashMap<String, String> passMap = new HashMap<String, String>();
//        passMap.put("Alice", "asdf");
//        passMap.put("Bob", "qazwsx");
//        passMap.put("Charlie", "charlie");
//        System.out.println("You must sign in before we continue...");
//        login(scanner, passMap);

        while(true){
            System.out.println("[1]: Add New Item ");
            System.out.println("[2]: Remove an Item ");
            System.out.println("[3]: Adjust Item Quantity ");

            Integer userInput = scanner.nextInt();
            scanner.nextLine();
            listInv( itemList);
            switch (userInput){
                case 1:
                    creatItem(scanner, itemList);

                    break;
                case 2:
                    removeItem(scanner, itemList);
                    break;
                case 3:
                    editQuant(scanner, itemList);
                    break;
                case 4:
                    listInv(itemList);

                default:
                    System.out.println("Invalid input!!!!");
            }
        }
    }

    public static void creatItem(Scanner scanner, ArrayList itemList) {
        //Create New Item
        System.out.println("Enter your Item");
        String text = scanner.nextLine();
        System.out.println("How many do you have?");
        int num = scanner.nextInt();
        InventoryItem inventoryItem = new InventoryItem(text, num);
        itemList.add(inventoryItem);
        listInv(itemList);

    }

    public static void removeItem(Scanner scanner, ArrayList itemList){
        //Remove Item
        System.out.println("Which Item would you like to remove?");
        int removeNum = scanner.nextInt();
        itemList.remove(removeNum-1);

    }

    static public void listInv( ArrayList<InventoryItem> itemList){
        //Print Item List
        int i = 1;
        for (InventoryItem item1 : itemList) {
            System.out.println(i + ". " + item1.itemQuantity + "x " + item1.itemName);
            i++;
        }
    }

    static public void editQuant(Scanner scanner, ArrayList<InventoryItem> itemList){
        System.out.println("Which item quantity has changed?");
        int selection = scanner.nextInt();
        scanner.nextLine();

        InventoryItem inventoryItem = itemList.get(selection-1);
        System.out.println("How many do you have?");
        int updatedQuant = scanner.nextInt();
        scanner.nextLine();

        inventoryItem.setItemQuantity(updatedQuant);


    }



//    public static void login(Scanner scanner, HashMap passMap){
//
//        System.out.println("What is your name?");
//        String tempName = scanner.next();
//
//        System.out.println("What is your Password?");
//        String tempPass = scanner.next();
//
//        if (passMap.get(tempName) == tempPass){
//            System.out.println("Welcome back " + tempName);
//        }else if (passMap.get(tempName) != tempPass) {
//            System.out.println("debugging: entered variables =  " + tempName + " : " + tempPass );
//            System.out.println("debugging: Hashmap passmap =  " + passMap + "\n");
//            System.out.println("passMap.get(tempName) returns: " + passMap.get(tempName) );
//            System.out.println("Sorry we don't recognize that Username/Password Combination\n");
//            login(scanner, passMap);
//        }else{
//            System.out.println("You should never reach this");
//        }
//
//    }
}
