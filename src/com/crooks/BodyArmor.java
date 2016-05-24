package com.crooks;

/**
 * Created by johncrooks on 5/24/16.
 */
public class BodyArmor extends InventoryItem {
    public BodyArmor(String text, int num) {
        this.itemName = text;
        this.itemQuantity = num;
        this.category = "Body Armor";
        this.weight = 4;
    }
}
