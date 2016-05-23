package com.crooks;

/**
 * Created by johncrooks on 5/23/16.
 */
public class InventoryItem {
    String itemName;
    int itemQuantity;

    public InventoryItem(String itemName, int itemQuantity) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
    }

    public InventoryItem() {
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
