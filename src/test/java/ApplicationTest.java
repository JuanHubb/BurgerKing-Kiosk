import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import camp.nextstep.edu.missionutils.test.NsTest;
import kiosk.Application;
import org.junit.jupiter.api.Test;

public class ApplicationTest extends NsTest {

    @Test
    void 키오스크_홈화면_동작확인() {
//        run("데이타구조-3-A0,자바프로그래밍언어-3-B+,컴퓨터구조-3-C0,컴퓨터네트워크-3-D+",
//                "미술의이해-3-P,교양특론3-1-NP,기독교의이해-2-F");
//        assertThat(output()).contains(
//                "<과목 목록>",
//                "[전공] 데이타구조,3,A0",
//                "[전공] 자바프로그래밍언어,3,B+",
//                "[전공] 컴퓨터구조,3,C0",
//                "[전공] 컴퓨터네트워크,3,D+",
//                "[교양] 미술의이해,3,P",
//                "[교양] 교양특론3,1,NP",
//                "[교양] 기독교의이해,2,F",
//                "<취득학점>",
//                "15학점",
//                "<평점평균>",
//                "2.36 / 4.5",
//                "<전공 평점평균>",
//                "2.75 / 4.5"
//        );
//    }

    @Test
    void 키오스크_홈화면_동작확인_2번() {
        run(1);
        assertThat(output()).contains(
                "=====햄버거 메뉴=====",
                "1. 와퍼 (6900원)",
                "2. 큐브 스테이크 와퍼 (8900원)",
                "3. 콰트로 치즈 와퍼 (7900원)",
                "4. 몬스터 와퍼 (9300원)",
                "5. 통새우 와퍼 (7900원)",
                "6. 블랙바베큐 와퍼 (9300원)",
                "메뉴선택 (0을 선택 시 홈으로):");
    }
    @Test
    void 키오스크_홈화면_동작확인_3번() {
        run(2);
        assertThat(output()).contains(
            "=====사이드 메뉴=====",
            "1. 너겟킹 (2500원)",
            "2. 해쉬 브라운 (1800원)",
            "3. 치즈스틱 (1200원)",
            "4. 어니언링 (2400원)",
            "5. 바삭킹 (3000원)",
            "6. 감자튀김 (2000원)",
            "메뉴선택 (0을 선택 시 홈으로):"
        );
    }
    @Test
    void 키오스크_홈화면_동작확인_4번() {
        run(3);
        assertThat(output()).contains(
            "=====음료 메뉴=====",
            "1. 코카콜라 (2000원)",
            "2. 코카콜라 제로 (2000원)",
            "3. 펩시 (2000원)",
            "4. 펩시 제로 (2000원)",
            "5. 스프라이트 (2000원)",
            "6. 스프라이트 제로 (2000원)",
            "메뉴선택 (0을 선택 시 홈으로):"
        );
    }
    @Test
    void 키오스크_홈화면_동작확인_5번() {

    }


    @Test
    void 예외처리_잘못된_메뉴번호_입력() {
//        assertThatIllegalArgumentException()
//                .isThrownBy(() -> {
//                    run("자바프로그래밍언어-3-E0", "한동인성교육-1-P");
//                    run("자바프로그래밍언어-3-A+", "한동인성교육-1-PD");
//                });
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}
