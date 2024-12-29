package kiosk;

import java.util.ArrayList;

public class FoodMenu {
    static class Hamburgers {
        String[] names = {"와퍼", "큐브 스테이크 와퍼", "콰트로 치즈 와퍼", "몬스터 와퍼", "통새우 와퍼", "블랙바베큐 와퍼"};
        int[] prices = {6900, 8900, 7900, 9300, 7900, 9300};
    }

    static class Sides {
        String[] names = {"너겟킹 ", "해쉬 브라운 ", "치즈스틱", "어니언링", "바삭킹", "감자튀김"};
        int[] prices = {2500, 1800, 1200, 2400, 3000, 2000};
    }

    static class Drinks {
        String[] names = {"코카콜라", "코카콜라 제로", "펩시", "펩시 제로", "스프라이트", "스프라이트 제로"};
        int[] prices = {2000, 2000, 2000, 2000, 2000, 2000};

    }


    public void buildFoodMenu(MenuItemManager menuItemManager) {
        Hamburgers hamburgers = new Hamburgers();
        Sides sides = new Sides();
        Drinks drinks = new Drinks();
        
        for (int i = 0; i < hamburgers.names.length; i++) {
            MenuItem menuItem = new MenuItem(hamburgers.names[i], hamburgers.prices[i]);
            menuItemManager.getHamburgerList().add(menuItem);
        }

        for (int i = 0; i < sides.names.length; i++) {
            MenuItem menuItem = new MenuItem(sides.names[i], sides.prices[i]);
            menuItemManager.getSideList().add(menuItem);
        }

        for (int i = 0; i < drinks.names.length; i++) {
            MenuItem menuItem = new MenuItem(drinks.names[i], drinks.prices[i]);
            menuItemManager.getDrinkList().add(menuItem);
        }
    }
}