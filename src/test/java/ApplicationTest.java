import kiosk.Application;
import kiosk.MenuItemManager;
import kiosk.ShoppingCart;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest{
    Application app;
    ShoppingCart cart;
    MenuItemManager menuItemManager;

    @BeforeEach
    public void setUp() {
        app = new Application();
        cart = new ShoppingCart();
        menuItemManager = app.initializeMenuItems();
    }

    @AfterEach
    public void reSet() {
        cart = new ShoppingCart();
    }


    @DisplayName("햄버거 메뉴 장바구니 추가 테스트")
    @Test
    public void addItemToShoppingCart_addHamburgerMenuItem_createNewMenuItemTest() {
        //given
        int inputMenuItemNumber = 1;

        //when
        cart.addItemToShoppingCart(menuItemManager.getHamburgerList().get(inputMenuItemNumber-1));

        //then
        assertEquals("와퍼", cart.getShoppingMenuItems().getFirst().getItemName());
        assertEquals(6900, cart.getShoppingMenuItems().getFirst().getItemPrice());
        assertEquals(1, cart.getShoppingMenuItems().getFirst().getItemAmount());
    }

    @DisplayName("사이드 메뉴 장바구니 추가 테스트")
    @Test
    public void addItemToShoppingCart_addSideMenuItem_createNewMenuItemTest() {
        //given
        int inputMenuItemNumber = 1;

        //when
        cart.addItemToShoppingCart(menuItemManager.getSideList().get(inputMenuItemNumber-1));

        //then
        assertEquals("너겟킹", cart.getShoppingMenuItems().getFirst().getItemName());
        assertEquals(2500, cart.getShoppingMenuItems().getFirst().getItemPrice());
        assertEquals(1, cart.getShoppingMenuItems().getFirst().getItemAmount());
    }

    @DisplayName("음료 메뉴 장바구니 추가 테스트")
    @Test
    public void addItemToShoppingCart_addDrinkMenuItem_createNewMenuItemTest() {
        //given
        int inputMenuItemNumber = 1;

        //when
        cart.addItemToShoppingCart(menuItemManager.getDrinkList().get(inputMenuItemNumber - 1));

        //then
        assertEquals("코카콜라", cart.getShoppingMenuItems().getFirst().getItemName());
        assertEquals(2000, cart.getShoppingMenuItems().getFirst().getItemPrice());
        assertEquals(1, cart.getShoppingMenuItems().getFirst().getItemAmount());
    }

//    @DisplayName("장바구니 메뉴 주문 테스트")
//    @Test
//    public void orderItems_addDrinkMenuItem_createNewMenuItemTest() {
//        //given
//        MenuItem firstMenuItem = menuItemManager.getDrinkList().getFirst();
//        cart.addItemToShoppingCart(firstMenuItem);
//
//        //when
//        cart.orderItems();
//
//        //then
//        assertEquals(cart.getShoppingMenuItems().getFirst(), firstMenuItem);
//        assertEquals(0, app.);
//    }

//    @DisplayName("장바구니 메뉴 수정 테스트")
//    @Test
//    public void adjustItemToShoppingCart_exitWithStatusZero_changeMenuItemAmount() {
//        //given
//        MenuItem newMenuItem = new MenuItem("와퍼",6900);
//
//        //when
//        cart.adjustItemAmount();
//
//        //then
//        assertNotEquals(-1, cart.checkMenuItemExistence(newMenuItem));
//        assertEquals(cart.getShoppingMenuItems().get(0),newMenuItem);
//    }
//
//    @DisplayName("장바구니 메뉴 삭제 테스트")
//    @Test
//    public void deleteItem_true_removeMenuItemFromShoppingCart() {
//        //given
//        MenuItem firstMenuItem = menuItemManager.getDrinkList().getFirst();
//        cart.addItemToShoppingCart(firstMenuItem);
//        //when
//        cart.deleteItem();
//        //then
//        assertTrue(cart.getShoppingMenuItems().isEmpty());
//    }

}
