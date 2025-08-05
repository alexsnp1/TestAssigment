package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

import static io.qameta.allure.Allure.step;

@Tag("Alfa")
public class BusinessAccountOpeningPage extends TestBase {
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldNavigateToBusinessAccountOpeningThroughHoverTest() {
            alfaBankPage
                    .openPage()
                    .waitForLoadingSite()
                    .hoverToSmallBusinessAndIE()
                    .hoverToBusinessAccount()
                    .clickToOpenAccountButton()
                    .checkTextResults("Заявка на открытие счёта для бизнеса");
    }
}
