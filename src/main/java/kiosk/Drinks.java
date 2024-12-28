package kiosk;

public class Drinks {
    private String[] drinkNames = {"코카콜라","코카콜라 제로","펩시","펩시 제로","스프라이트","스프라이트 제로"};
    private int[] drinkPrices = {2000,2000,2000,2000,2000,2000};
    

    public void buildDrinkMenu(){
        for (int i = 0; i < drinkNames.length; i++) {
            MenuItem menuItem = new MenuItem(getDrinkNames()[i], getDrinkPrices()[i]);
            MenuItemManager menuItemManager = new MenuItemManager();
            menuItemManager.setMenuItems(menuItem);
        }
    }

    public String[] getDrinkNames() {
        return drinkNames;
    }

    public void setDrinkNames(String[] drinkNames) {
        this.drinkNames = drinkNames;
    }

    public int[] getDrinkPrices() {
        return drinkPrices;
    }

    public void setDrinkPrices(int[] drinkPrices) {
        this.drinkPrices = drinkPrices;
    }
}
