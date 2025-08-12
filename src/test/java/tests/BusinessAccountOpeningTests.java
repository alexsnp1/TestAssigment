package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BusinessAccountOpeningPage;

@Owner("alexsnp")
@Feature("Действия с верхним меню главной страницы")
@Tag("Alfa")
public class BusinessAccountOpeningTests extends TestBase {
    BusinessAccountOpeningPage businessAccountOpeningPage = new BusinessAccountOpeningPage();
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка перехода на вкладку 'Регистрация бизнеса' через верхнее меню")
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
