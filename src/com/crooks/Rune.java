package com.crooks;

/**
 * Created by johncrooks on 5/24/16.
 */
public class Rune extends InventoryItem {
    public Rune(String text, int num) {
        this.itemName = text;
        this.itemQuantity = num;
        this.category = "Rune";
        this.weight = 1;
    }
}
