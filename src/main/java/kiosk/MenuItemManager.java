package kiosk;

import java.util.Scanner;

public class MenuItemManager {
    private MenuItem[] hamburgerList;
    private MenuItem[] sideList;
    private MenuItem[] drinkList;


    public void selectHamburgers(ShoppingCart cart){
        PrintHamburgerMenu();
        cart.addItemToShoppingCart(getHamburgerList()[inputItem()]);
    }
    public void selectSides(ShoppingCart cart){
        PrintSideMenu();
        cart.addItemToShoppingCart(getSideList()[inputItem()]);
    }
    public void selectDrink(ShoppingCart cart){
        PrintDrinkMenu();
        cart.addItemToShoppingCart(getDrinkList()[inputItem()]);
    }

    public void PrintHamburgerMenu(){
        System.out.println("=====햄버거 메뉴=====\n" +
                "\n" +
                "1. 와퍼 (6900원)\n" +
                "2. 큐브 스테이크 와퍼 (8900원)\n" +
                "3. 콰트로 치즈 와퍼 (7900원)\n" +
                "4. 몬스터 와퍼 (9300원)\n" +
                "5. 통새우 와퍼 (7900원)\n" +
                "6. 블랙바베큐 와퍼 (9300원)\n" +
                "\n" +
                "메뉴선택 (0을 선택 시 홈으로):");
    }
    public void PrintSideMenu(){
        System.out.println("=====사이드 메뉴=====\n" +
                "\n" +
                "1. 너겟킹 (2500원)\n" +
                "2. 해쉬 브라운 (1800원)\n" +
                "3. 치즈스틱 (1200원)\n" +
                "4. 어니언링 (2400원)\n" +
                "5. 바삭킹 (3000원)\n" +
                "6. 감자튀김 (2000원)\n" +
                "\n" +
                "메뉴선택 (0을 선택 시 홈으로):");
    }
    public void PrintDrinkMenu(){
        System.out.println("=====음료 메뉴=====\n" +
                "\n" +
                "1. 코카콜라 (2000원)\n" +
                "2. 코카콜라 제로 (2000원)\n" +
                "3. 펩시 (2000원)\n" +
                "4. 펩시 제로 (2000원)\n" +
                "5. 스프라이트 (2000원)\n" +
                "6. 스프라이트 제로 (2000원)\n" +
                "\n" +
                "메뉴선택 (0을 선택 시 홈으로):");
    }

    public int inputItem(){
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();
        return choice;
    }


    public MenuItem[] getHamburgerList() {
        return hamburgerList;
    }

    public void setHamburgerList(MenuItem[] hamburgerList) {
        this.hamburgerList = hamburgerList;
    }

    public MenuItem[] getSideList() {
        return this.sideList;
    }

    public void setSideList(MenuItem[] sideList) {
        this.sideList = sideList;
    }

    public MenuItem[] getDrinkList() {
        return drinkList;
    }

    public void setDrinkList(MenuItem[] drinkList) {
        this.drinkList = drinkList;
    }
}
