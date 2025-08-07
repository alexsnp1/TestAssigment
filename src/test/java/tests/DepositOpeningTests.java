package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DepositOpeningPage;

@Tag("Alfa")
public class DepositOpeningTests extends TestBase{
    DepositOpeningPage depositOpeningPage = new DepositOpeningPage ();

    @Test
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
