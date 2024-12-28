package kiosk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShoppingCart {
    private static ArrayList<HashMap> shoppingList;
    private static HashMap<String, MenuItem> shoppingMenuItems;
    private static String[] currentShoppingCartKeyList;
    private int totalPrice = 0;

    // Application 4번 기능
    public void checkShoppingCart(){
        System.out.println("===== 장바구니 =====\n" );
        printShoppingCart();
        controlShoppingCartMenu(inputNumber());
    }
    public void printShoppingCart() {
        for (String eachMenuItemKey : shoppingMenuItems.keySet()) {
            totalPrice += shoppingMenuItems.get(eachMenuItemKey).getItemPrice();
            System.out.println("- " + shoppingMenuItems.get(eachMenuItemKey).getItemAmount() + "개");
        }
        System.out.println(
            "\n====================\n" +
            "1. 주문하기 \n" +
            "2. 수량 조절하기\n" +
            "3. 삭제하기 \n" +
            "\n총 가격: " + totalPrice + "원\n" +
            "\n메뉴선택 (0을 선택 시 홈으로):");
    }

    public int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();
        return choice;
    }


    public void addItemToShoppingCart(String menuItemType, MenuItem menuItem, ShoppingCart cart){
        shoppingMenuItems.put(menuItemType, menuItem);
        shoppingList.add(shoppingMenuItems);
        cart.setTotalPrice(menuItem.getItemAmount());
    }
    //해시맵을 계속 넣게 됨. 해시맵은 크게 햄버거, 사이드, 음료로 구성됨. 따라서 키값이 추가될 때마다 요소가 하나 증가한 해시맵을 계속해서 추가하게 됨

    public void controlShoppingCartMenu(int selectedNumber){
        switch (selectedNumber){
            case 1:
                orderItems();
                break;
            case 2:
                adjustItemAmount();
                break;
            case 3:
                deleteItem();
                break;
            case 0:
                // 정상 작동되는지 확인 필요
                return;
            default:
                System.out.println("잘못된 숫자를 입력하셨습니다.");
                break;
        }
    }

    public void orderItems(){

    }
    public void adjustItemAmount(){
        System.out.println(
                "===== 수량 조절하기 =====\n" +
                "\n현재 장바구니\n");
        printCurrentShoppingCart();
        System.out.println("수량을 조절할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로): ");
        int menuItemNumber = findIndexInCurrentShoppingCartKeyList(getCurrentShoppingCartKeyList(inputNumber()));
        System.out.println("변경할 수량을 입력하세요: ");
        switch (menuItemNumber){
            case 0:
                break;
            default:
                shoppingMenuItems.get(getCurrentShoppingCartKeyList(menuItemNumber)).setItemAmount(inputNumber());
                break;
        }
    }
    // 해시맵은 메뉴아이템타입을 키값으로 하기 때문에 접근 방식이 조금 수정돼야 한다.
    //
     //

    public void deleteItem(){
        System.out.println(
                "===== 삭제하기 =====\n" +
                "\n현재 장바구니\n");
        printCurrentShoppingCart();
        System.out.println("삭제할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로): ");
        int menuItemNumber = findIndexInCurrentShoppingCartKeyList(getCurrentShoppingCartKeyList(inputNumber()));
        if (menuItemNumber == 0){return;}
        System.out.println("정말 삭제 하시겠습니까? (0: 취소 및 홈으로 1: 삭제): ");
        switch (inputNumber()){
            case 0:
                break; 
            case 1:
                shoppingMenuItems.remove(getCurrentShoppingCartKeyList(menuItemNumber));
                shoppingList.remove(shoppingMenuItems.get(getCurrentShoppingCartKeyList(menuItemNumber)));
                break;
        }
    }
    // 해시맵은 메뉴아이템타입을 키값으로 하기 때문에 접근 방식이 조금 수정돼야 한다. 여기도
    //
     //


    public void printCurrentShoppingCart(){
        int menuItemNumber = 1;
        String[] menuItemKeySetAboutTypeArray = shoppingMenuItems.keySet().toArray(new String[0]);

        for (String eachMenuItemKey : menuItemKeySetAboutTypeArray) {
            currentShoppingCartKeyList[menuItemNumber] = eachMenuItemKey;
            totalPrice += shoppingMenuItems.get(eachMenuItemKey).getItemPrice();
            System.out.println(menuItemNumber + ". " + shoppingMenuItems.get(eachMenuItemKey).getItemAmount() + "개");
            menuItemNumber++;
        }
        changeToCurrentShoppingCartKeyList(menuItemKeySetAboutTypeArray);
    }
    public void changeToCurrentShoppingCartKeyList(String[] menuItemKeySetAboutTypeArray){
        int menuItemNumber = 1;

        for (String menuItemType : menuItemKeySetAboutTypeArray){
            setCurrentShoppingCartKeyList(menuItemNumber, shoppingMenuItems.get(menuItemType).getItemName());
            menuItemNumber++;
        }
    }
    public int findIndexInCurrentShoppingCartKeyList(String targetMenuItem){
        for (int i = 0; i < currentShoppingCartKeyList.length; i++) {
            if (targetMenuItem.equals(currentShoppingCartKeyList[i])) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<HashMap> getShoppingList() {
        return shoppingList;
    }

    public static void setShoppingList(ArrayList<HashMap> shoppingList) {
        ShoppingCart.shoppingList = shoppingList;
    }

    public static HashMap<String, MenuItem> getShoppingMenuItems() {
        return shoppingMenuItems;
    }

    public static void setShoppingMenuItems(HashMap<String, MenuItem> shoppingMenuItems) {
        ShoppingCart.shoppingMenuItems = shoppingMenuItems;
    }

    public static String getCurrentShoppingCartKeyList(int index) {
        return currentShoppingCartKeyList[index];
    }

    public static void setCurrentShoppingCartKeyList(int index, String menuItemKeyArray) {
        currentShoppingCartKeyList[index] = menuItemKeyArray;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
