package com.crooks;

/**
 * Created by johncrooks on 5/24/16.
 */
public class Helmet extends InventoryItem {
    public Helmet(String text, int num) {
        this.itemName = text;
        this.itemQuantity = num;
        this.category = "Helmet";
        this.weight = 2;
    }
}
