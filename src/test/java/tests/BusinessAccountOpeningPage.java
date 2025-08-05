package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

import static io.qameta.allure.Allure.step;

@Tag("Alfa")
public class BusinessAccountOpeningPage extends TestBase {
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldNavigateToBusinessAccountOpeningThroughHover() {
        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Wait For Loading Site", () -> {
            alfaBankPage.waitForLoadingSite();
        });
        step("Hover To Small Business And IE(", () -> {
            alfaBankPage.hoverToSmallBusinessAndIE();
        });
        step("Hover To Business Account", () -> {
            alfaBankPage.hoverToBusinessAccount();
        });
        step("Click To Open Account Button", () -> {
            alfaBankPage.clickToOpenAccountButton();
        });
        step("Check Text Results", () -> {
            alfaBankPage.checkTextResults("Заявка на открытие счёта для бизнеса");
        });
    }
}
