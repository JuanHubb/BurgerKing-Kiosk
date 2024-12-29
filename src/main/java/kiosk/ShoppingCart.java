package kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    private ArrayList<MenuItem> shoppingMenuItems;

    public ShoppingCart() {
        shoppingMenuItems = new ArrayList<>();
    }

    // Application 4번 기능
    public void checkShoppingCart(){
        System.out.println("===== 장바구니 =====\n" );
        printShoppingCart();
        int inputNumber = inputNumber();
        if (inputNumber != 0){
            controlShoppingCartMenu(inputNumber);
        }
    }
    public void printShoppingCart() {
        int totalPrice = 0;
        if (!getShoppingMenuItems().isEmpty()){
            for (MenuItem eachMenuItem : getShoppingMenuItems()) {
                totalPrice += eachMenuItem.getItemPrice() * eachMenuItem.getItemAmount();
                System.out.println("- " + eachMenuItem.getItemName() + " " + eachMenuItem.getItemAmount() + "개");
            }
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
        int choice;

        do{
            choice = scanner.nextInt();
            scanner.nextLine();
        }while(checkInvalidValue(choice));

        return choice;
    }
    public boolean checkInvalidValue(int inputNumber){
        if (inputNumber < 0 || inputNumber > 6){
            System.out.println("잘못된 번호를 입력하셨습니다");
            return true;
        }
        return false;
    }

    public void addItemToShoppingCart(MenuItem menuItem){
        menuItem.setItemAmount(menuItem.getItemAmount() + 1);
        getShoppingMenuItems().add(menuItem);
        System.out.println("장바구니에 담았습니다");
    }

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
        System.out.println("주문완료");
        System.exit(0);
    }

    public void adjustItemAmount(){
        System.out.println("===== 수량 조절하기 =====");
        printCurrentShoppingCart();
        System.out.println("수량을 조절할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로): ");
        int IndexOfMenuItemToChangeAmount = inputNumber();
        System.out.println("변경할 수량을 입력하세요: ");
        switch (IndexOfMenuItemToChangeAmount){
            case 0:
                break;
            default:
                getShoppingMenuItems().get(IndexOfMenuItemToChangeAmount-1).setItemAmount(inputNumber());
                break;
        }
    }

    public void deleteItem(){
        System.out.println("===== 삭제하기 =====");
        printCurrentShoppingCart();
        System.out.println("삭제할 메뉴 번호를 선택하세요 (0을 선택 시 홈으로): ");
        int IndexOfMenuItemToChangeAmount = inputNumber();
        if (IndexOfMenuItemToChangeAmount == 0){return;}
        System.out.println("정말 삭제 하시겠습니까? (0: 취소 및 홈으로 1: 삭제): ");
        switch (inputNumber()){
            case 0:
                break; 
            case 1:
                getShoppingMenuItems().remove(IndexOfMenuItemToChangeAmount);
                break;
        }
    }

    public void printCurrentShoppingCart() {
        int NumberOfMenuItem = 1;

        System.out.println("\n현재 장바구니\n");
        for (MenuItem eachMenuItem : getShoppingMenuItems()) {
            System.out.println(NumberOfMenuItem + ". " + eachMenuItem.getItemName() + " " +  eachMenuItem.getItemAmount() + "개");
            NumberOfMenuItem++;
        }
        System.out.println();
    }


    public ArrayList<MenuItem> getShoppingMenuItems() {
        return shoppingMenuItems;
    }

    public void setShoppingMenuItems(ArrayList<MenuItem> shoppingMenuItems) {
        this.shoppingMenuItems = shoppingMenuItems;
    }
}
