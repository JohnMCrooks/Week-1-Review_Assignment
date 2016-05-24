package com.crooks;

/**
 * Created by johncrooks on 5/23/16.
 */
public class InventoryItem {
    String itemName;
    int itemQuantity;
    String category;
    int weight;


    public InventoryItem(String itemName, int itemQuantity, String category, int weight) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.category = category;
        this.weight = weight;
    }

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

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
