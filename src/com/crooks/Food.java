package com.crooks;

/**
 * Created by johncrooks on 5/24/16.
 */
public class Food extends InventoryItem {
    public Food(String text, int num) {
        this.itemName = text;
        this.itemQuantity = num;
        this.category = "Food";
        this.weight = 1;
    }
}
