package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DepositOpeningPage;

@Owner("alexsnp")
@Feature("Действия с калькулятором на главной странице")
@Tag("Alfa")
public class DepositOpeningTests extends TestBase{
    DepositOpeningPage depositOpeningPage = new DepositOpeningPage ();
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка правильных расчетов калькулятора и перехода к открытию депозита")
    void shouldNavigateToDepositOpeningPageAfterCalculationTest() {
        depositOpeningPage
                    .openPage()
                    .checkIfAmountValueCorrect()
                    .set6MonthsDepositTerm()
                    .disableNewMoneyConditionCheckbox()
                    .checkIfInterestRateCorrect()
                    .clickToOpenDepositButton()
                    .checkTextResults("Как открыть вклад");
    }
}
