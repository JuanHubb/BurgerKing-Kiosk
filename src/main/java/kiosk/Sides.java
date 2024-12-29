package kiosk;

public class Sides {
    private String[] sideNames = {"너겟킹 ","해쉬 브라운 ","치즈스틱","어니언링","바삭킹","감자튀김"};
    private int[] sidePrices = {2500,1800,1200,2400,3000,2000};
    

    public void buildSideMenu(){
        for (int i = 0; i < sideNames.length; i++) {
            MenuItem menuItem = new MenuItem("Side", getSideNames()[i], getSidePrices()[i]);
            MenuItemManager menuItemManager = new MenuItemManager();
        }
    }
    
    public String[] getSideNames() {
        return sideNames;
    }

    public void setSideNames(String[] sideNames) {
        this.sideNames = sideNames;
    }

    public int[] getSidePrices() {
        return sidePrices;
    }

    public void setSidePrices(int[] sidePrices) {
        this.sidePrices = sidePrices;
    }
}
