package tests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

@Tag("Alfa")
public class AlfaTests extends TestBase {
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldOpenBusinessRegistrationTab() {
        alfaBankPage
                .openPage()
                .selectSmallBusinessTab()
                .openBusinessRegistrationPage()
                .checkTextResult("Регистрация бизнеса онлайн");
    }

    @Test
    void shouldSearchForDebitCardAndSeeResults() {
        alfaBankPage
                .openPage()
                .waitForLoadingSite()
                .openSearchBar()
                .setValueToSearchBar()
                .checkTextResult("Дебетовая карта");
    }

    @Test
    void shouldNavigateToDepositOpeningPageAfterCalculation() {
        alfaBankPage
                .openPage()
                .checkIfAmountValueCorrect()
                .set3MonthsDepositTerm()
                .disableNewMoneyConditionCheckbox()
                .checkIfInterestRateCorrect()
                .clickToOpenDepositButton()
                .checkTextResult("Как открыть вклад");
    }
    @Test
    void shouldNavigateToBusinessAccountOpeningThroughHover () {
        alfaBankPage
                .openPage()
                .waitForLoadingSite()
                .hoverToSmallBusinessAndIE()
                .hoverToBusinessAccount()
                .clickToOpenAccountButton()
                .checkTextResult("Заявка на открытие счёта для бизнеса");
    }
    @Test
    void shouldOpenEnglishVersion () {
        alfaBankPage
                .openPage()
                .clickToEnglishLanguageOfSite()
                .checkTextResult("The most phygital bank");
    }


}
