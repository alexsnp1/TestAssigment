package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

@Tag("Alfa")
public class DepositOpeningPage extends TestBase{
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldNavigateToDepositOpeningPageAfterCalculationTest() {

            alfaBankPage
                    .openPage()
                    .checkIfAmountValueCorrect()
                    .set6MonthsDepositTerm()
                    .disableNewMoneyConditionCheckbox()
                    .checkIfInterestRateCorrect()
                    .clickToOpenDepositButton()
                    .checkTextResults("Как открыть вклад");
    }
}
