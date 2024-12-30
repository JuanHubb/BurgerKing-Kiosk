import kiosk.Application;
import kiosk.MenuItem;
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

    @DisplayName("햄버거 메뉴 추가 테스트")
    @Test
    public void testSelectHamburgers() {
        //given
        int inputMenuItemNumber = 1;

        //when
        for (;inputMenuItemNumber <=6; inputMenuItemNumber++){
            cart.addItemToShoppingCart(menuItemManager.getHamburgerList().get(inputMenuItemNumber -1));
        }

        //then
        assertEquals("와퍼", cart.getShoppingMenuItems().get(0).getItemName());
        assertEquals("큐브 스테이크 와퍼", cart.getShoppingMenuItems().get(1).getItemName());
        assertEquals("콰트로 치즈 와퍼", cart.getShoppingMenuItems().get(2).getItemName());
        assertEquals("몬스터 와퍼", cart.getShoppingMenuItems().get(3).getItemName());
        assertEquals("통새우 와퍼", cart.getShoppingMenuItems().get(4).getItemName());
        assertEquals("블랙바베큐 와퍼", cart.getShoppingMenuItems().get(5).getItemName());
    }

    @DisplayName("사이드 메뉴 추가 테스트")
    @Test
    public void testSelectSides() {
        //given
        int inputMenuItemNumber = 1;

        //when
        for (;inputMenuItemNumber <=6; inputMenuItemNumber++){
            cart.addItemToShoppingCart(menuItemManager.getHamburgerList().get(inputMenuItemNumber -1));
        }

        //then
        assertEquals("너겟킹", cart.getShoppingMenuItems().get(0).getItemName());
        assertEquals("해쉬 브라운", cart.getShoppingMenuItems().get(1).getItemName());
        assertEquals("치즈스틱", cart.getShoppingMenuItems().get(2).getItemName());
        assertEquals("어니언링", cart.getShoppingMenuItems().get(3).getItemName());
        assertEquals("바삭킹", cart.getShoppingMenuItems().get(4).getItemName());
        assertEquals("감자튀김", cart.getShoppingMenuItems().get(5).getItemName());
    }

    @DisplayName("음료 메뉴 추가 테스트")
    @Test
    public void testSelectDrink() {
        //given
        int inputMenuItemNumber = 1;

        //when
        for (;inputMenuItemNumber <=6; inputMenuItemNumber++){
            cart.addItemToShoppingCart(menuItemManager.getHamburgerList().get(inputMenuItemNumber -1));
        }

        //then
        assertEquals("코카콜라", cart.getShoppingMenuItems().get(0).getItemName());
        assertEquals("코카콜라 제로", cart.getShoppingMenuItems().get(1).getItemName());
        assertEquals("펩시", cart.getShoppingMenuItems().get(2).getItemName());
        assertEquals("펩시 제로", cart.getShoppingMenuItems().get(3).getItemName());
        assertEquals("스프라이트", cart.getShoppingMenuItems().get(4).getItemName());
        assertEquals("스프라이트 제로", cart.getShoppingMenuItems().get(5).getItemName());
    }

//    @Test
//    void 키오스크_메뉴화면_동작확인() {
//        //given
//
//        //when
//        app.controlByMenuNumber(menuItemManager, cart);
//        assertThat(output()).contains(
//                "=====햄버거 메뉴=====",
//                "1. 와퍼 (6900원)",
//                "2. 큐브 스테이크 와퍼 (8900원)",
//                "3. 콰트로 치즈 와퍼 (7900원)",
//                "4. 몬스터 와퍼 (9300원)",
//                "5. 통새우 와퍼 (7900원)",
//                "6. 블랙바베큐 와퍼 (9300원)",
//                "메뉴선택 (0을 선택 시 홈으로):");
//    }

    @DisplayName("장바구니 메뉴 추가 테스트")
    @Test
    public void testAddItemToShoppingCart() {
        //given
        MenuItem newMenuItem = new MenuItem("와퍼",6900);

        //when
        cart.addItemToShoppingCart(newMenuItem);

        //then
        cart.checkMenuItemExistence(newMenuItem);
        assertEquals(cart.getShoppingMenuItems().get(0),newMenuItem);

    }


    @Test
    void 예외처리_잘못된_메뉴번호_입력() {
//        assertThatIllegalArgumentException()
//                .isThrownBy(() -> {
//                    run("자바프로그래밍언어-3-E0", "한동인성교육-1-P");
//                    run("자바프로그래밍언어-3-A+", "한동인성교육-1-PD");
//                });
    }
}
