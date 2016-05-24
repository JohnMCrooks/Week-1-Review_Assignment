package com.crooks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by johncrooks on 5/24/16.
 */
public class MainTest {
    Scanner scanner = new Scanner(System.in);

    InventoryItem inventoryItem;
    ArrayList<InventoryItem> itemList = new ArrayList<InventoryItem>();

    @Test
    public void createItem2() throws Exception {

        System.out.println("Enter your item:");
        String text = scanner.nextLine();

        System.out.println("How many do You have?");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Category:[Helmet/Body Armor/Weapon/Food/Rune]");
        String cat = scanner.nextLine();
        cat = cat.toLowerCase();

        InventoryItem inventoryItem;

        switch (cat){
            case "helmet":
                inventoryItem = new Helmet(text, num);
                break;
            case "body armor":
                inventoryItem = new BodyArmor(text, num);
                break;
            case "weapon":
                inventoryItem = new Weapon(text, num);
                break;
            case "food":
                inventoryItem = new Food(text, num);
                break;
            case "rune":
                inventoryItem = new Rune(text, num);
                break;
            default:
                inventoryItem = new InventoryItem(text, num, "Unknown", 1);
                break;
        }
        itemList.add(inventoryItem);

    }


}