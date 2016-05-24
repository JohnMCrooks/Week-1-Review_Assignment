package com.crooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<InventoryItem> itemList = new ArrayList<InventoryItem>();

        HashMap<String, String> passMap = new HashMap<String, String>();
        passMap.put("Alice", "asdf");
        passMap.put("Bob", "qazwsx");
        passMap.put("Charlie", "charlie");
        System.out.println("You must sign in before we continue...");
        login(passMap);

        while(true){
            listInv( itemList);

            System.out.println("      Options:\n");
            System.out.println("[1]: Add New Item ");
            System.out.println("[2]: Remove an Item ");
            System.out.println("[3]: Adjust Item Quantity ");
            System.out.println("[4]: View Inventory ");

            Integer userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput){
                case 1:
                    creatItem(itemList);
                    break;
                case 2:
                    removeItem(itemList);
                    break;
                case 3:
                    editQuant( itemList);
                    break;
                case 4:
                    System.out.println("Your inventory consists of the following Items:");
                    listInv(itemList);
                    System.out.println("What else would you like to do?\n");
                    break;
                default:
                    System.out.println("Invalid input! You Must Choose a number from above!");
            }
        }
    }

    public static void login(HashMap passMap){

        System.out.println("What is your name?");
        String tempName = scanner.nextLine();

        System.out.println("What is your Password?");
        String tempPass = scanner.nextLine();

        if (passMap.get(tempName).equals(tempPass)){
            System.out.println("Welcome back " + tempName + "\n");
        }else if (passMap.get(tempName).equals(tempPass)) {
            System.out.println("Sorry we don't recognize that Username/Password Combination\n");
            login(passMap);
        }else{
            System.out.println("You should never reach this");
        }

    }

    public static void creatItem( ArrayList itemList) {
        //Create New Item
        System.out.println("Enter your Item");
        String text = scanner.nextLine();
        System.out.println("How many do you have?");
        try{
            int num = scanner.nextInt();
            scanner.nextLine();
            InventoryItem inventoryItem = new InventoryItem(text, num);
            itemList.add(inventoryItem);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }

    public static void removeItem( ArrayList itemList){
        //Remove Item
        System.out.println("Which Item would you like to remove?");
        int removeNum = scanner.nextInt();
        try {
            itemList.remove(removeNum - 1);
        }catch (Exception e){
            System.out.println("Something went wrong!!!");
        }
    }

    static public void listInv( ArrayList<InventoryItem> itemList){
        //Print Item List
        int i = 1;
        for (InventoryItem item1 : itemList) {
            System.out.println(i + ". " + item1.itemQuantity + "x " + item1.itemName );
            i++;
        }
    }

    static public void editQuant( ArrayList<InventoryItem> itemList){
        //Passing the
        System.out.println("Which item quantity has changed?");
        int selection = scanner.nextInt();
        scanner.nextLine();
        try {
            InventoryItem inventoryItem = itemList.get(selection - 1);
            System.out.println("How many do you have?");
            int updatedQuant = scanner.nextInt();
            scanner.nextLine();

            inventoryItem.setItemQuantity(updatedQuant);
        } catch (NumberFormatException e) {
            System.out.println("You must Use a number! \n");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The Number you selected isn't a valid option \n");
        }
    }


}
