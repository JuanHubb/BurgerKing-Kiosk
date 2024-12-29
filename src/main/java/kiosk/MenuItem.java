package kiosk;

public class MenuItem {
    private String itemType;
    private String itemName;
    private int itemPrice;
    private int itemAmount;


    public MenuItem(String itemType, String itemName, int itemPrice) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemAmount = 0;
    }


    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }
}
