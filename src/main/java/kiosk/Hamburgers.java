package kiosk;

public class Hamburgers {
    private String[] hamburgerNames = {"와퍼","큐브 스테이크 와퍼","콰트로 치즈 와퍼","몬스터 와퍼","통새우 와퍼","블랙바베큐 와퍼"};
    private int[] hamburgerPrices = {6900,8900,7900,9300,7900,9300};


    public void buildHamburgersMenu(){
        for (int i = 0; i < hamburgerNames.length; i++) {
            MenuItem menuItem = new MenuItem("Hamburger", getHamburgerNames()[i], getHamburgerPrices()[i]);
            MenuItemManager menuItemManager = new MenuItemManager();
        }
    }

    public String[] getHamburgerNames() {
        return hamburgerNames;
    }

    public void setHamburgerNames(String[] hamburgerNames) {
        this.hamburgerNames = hamburgerNames;
    }

    public int[] getHamburgerPrices() {
        return hamburgerPrices;
    }

    public void setHamburgerPrices(int[] hamburgerPrices) {
        this.hamburgerPrices = hamburgerPrices;
    }
}
