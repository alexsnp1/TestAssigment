package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

import static io.qameta.allure.Allure.step;

@Tag("Alfa")
public class DepositOpeningPage extends TestBase{
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldNavigateToDepositOpeningPageAfterCalculationTest() {

        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Check If Amount Value is Correct", () -> {
            alfaBankPage.checkIfAmountValueCorrect();
        });
        step("Set 3 Months Deposit Term", () -> {
            alfaBankPage.set6MonthsDepositTerm();
        });
        step("Disable New Money Condition Checkbox", () -> {
            alfaBankPage.disableNewMoneyConditionCheckbox();
        });
        step("Check If Interest Rate is Correct", () -> {
            alfaBankPage.checkIfInterestRateCorrect();
        });
        step("Click To Open Deposit Button", () -> {
            alfaBankPage.clickToOpenDepositButton();
        });
        step("Check Text Results", () -> {
            alfaBankPage.checkTextResults("Как открыть вклад");
        });
    }
}
