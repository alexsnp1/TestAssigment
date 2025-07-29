package tests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

import static io.qameta.allure.Allure.step;

@Tag("Alfa")
public class AlfaTests extends TestBase {
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldOpenBusinessRegistrationTab() {
        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Select Small Business Tab", () -> {
            alfaBankPage.selectSmallBusinessTab();
        });
        step("Open Business Registration Page", () -> {
            alfaBankPage.openBusinessRegistrationPage();
        });
        step("Check Text Results", () -> {
            alfaBankPage.checkTextResults("Регистрация бизнеса онлайн");
        });
    }

    @Test
    void shouldSearchForDebitCardAndSeeResults() {
        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Wait For Loading Site", () -> {
            alfaBankPage.waitForLoadingSite();
        });
        step("Open Search Bar", () -> {
            alfaBankPage.openSearchBar();
        });
        step("Set Value To Search Bar", () -> {
            alfaBankPage.setValueToSearchBar();
        });
        step("Check Text Results", () -> {
            alfaBankPage.checkTextResults("Дебетовая карта");
        });
    }

    @Test
    void shouldNavigateToDepositOpeningPageAfterCalculation() {

        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Check If Amount Value is Correct", () -> {
        alfaBankPage.checkIfAmountValueCorrect();
        });
        step("Set 3 Months Deposit Term", () -> {
            alfaBankPage.set3MonthsDepositTerm();
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
    @Test
    void shouldNavigateToBusinessAccountOpeningThroughHover () {
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
    @Test
    void shouldOpenEnglishVersion () {
        step("Open page", () -> {
        alfaBankPage.openPage();
        });
        step("Click To English Language Of Site", () -> {
        alfaBankPage.clickToEnglishLanguageOfSite();
        });
        step("Check Text Results", () -> {
        alfaBankPage.checkTextResults("The most phygital bank");
        });
    }
}
