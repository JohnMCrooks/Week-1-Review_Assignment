package com.crooks;

/**
 * Created by johncrooks on 5/24/16.
 */
public class Weapon extends InventoryItem {
    public Weapon(String text, int num) {
        this.itemName = text;
        this.itemQuantity = num;
        this.category="Weapon";
        this.weight = 2;
    }
}
