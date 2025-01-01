package kiosk;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Application app = new Application();
        app.KioskRun(app);
    }

    public void KioskRun(Application app) {
        MenuItemManager menuItemManager = app.initializeMenuItems();
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            app.printHomeMenu();
            app.controlByMenuNumber(menuItemManager, cart);
        }
    }

    public MenuItemManager initializeMenuItems() {
        MenuItemManager menuItemManager = new MenuItemManager();
        FoodMenu foodMenu = new FoodMenu();

        foodMenu.buildFoodMenu(menuItemManager);

        return menuItemManager;
    }

    public void printHomeMenu() {
        System.out.println("\n=====홈=====\n" +
                "\n" +
                "1. 햄버거\n" +
                "2. 사이드\n" +
                "3. 음료\n" +
                "4. 장바구니\n" +
                "5. 종료\n" +
                "\n" +
                "메뉴선택:");
    }

    public void controlByMenuNumber(MenuItemManager menuItemManager, ShoppingCart cart) {
        int selectedNumber = inputNumber();

        switch (selectedNumber) {
            case 1:
                no1HamburgerMenu(menuItemManager, cart);
                break;
            case 2:
                no2SideMenu(menuItemManager, cart);
                break;
            case 3:
                no3DrinkMenu(menuItemManager, cart);
                break;
            case 4:
                no4ShoppingCartMenu(cart);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("잘못된 숫자를 입력하셨습니다.");
                break;
        }
    }

    public int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public void no1HamburgerMenu(MenuItemManager menuItemManager, ShoppingCart cart) {
        menuItemManager.selectHamburgers(cart);
    }
    public void no2SideMenu(MenuItemManager menuItemManager, ShoppingCart cart) {
        menuItemManager.selectSides(cart);
    }
    public void no3DrinkMenu(MenuItemManager menuItemManager, ShoppingCart cart) {
        menuItemManager.selectDrink(cart);
    }
    public void no4ShoppingCartMenu(ShoppingCart cart) {
        cart.checkShoppingCart();
    }
}