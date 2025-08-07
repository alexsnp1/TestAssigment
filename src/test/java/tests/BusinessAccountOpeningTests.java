package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BusinessAccountOpeningPage;

@Tag("Alfa")
public class BusinessAccountOpeningTests extends TestBase {
    BusinessAccountOpeningPage businessAccountOpeningPage = new BusinessAccountOpeningPage();

    @Test
    void shouldNavigateToBusinessAccountOpeningThroughHoverTest() {
        businessAccountOpeningPage
                    .openPage()
                    .waitForLoadingSite()
                    .hoverToSmallBusinessAndIE()
                    .hoverToBusinessAccount()
                    .clickToOpenAccountButton()
                    .checkTextResults("Заявка на открытие счёта для бизнеса");
    }
}
