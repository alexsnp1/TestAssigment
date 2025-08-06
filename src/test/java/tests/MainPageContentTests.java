package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

@Tag("Alfa")
public class MainPageContentTests extends TestBase {
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldCheckLogoTest() {
            alfaBankPage
                    .openPage()
                    .checkLogo();
    }

    @Test
    void shouldCheckBannerTest() {
            alfaBankPage
                    .openPage()
                    .checkTextResults("Бесплатная Альфа‑Карта");
    }

    @Test
    void shouldCheckToBecomeAClientButtonTest() {
            alfaBankPage
                    .openPage()
                    .checkToBecomeAClientButton();
    }

    @Test
    void shouldCheckLoginButtonTest() {
            alfaBankPage
                    .openPage()
                    .checkLoginButton();
    }
    @Test
    void shouldCheckRetailDropdownTest() {
            alfaBankPage
                    .openPage()
                    .checkRetailDropdown();
    }
    @Test
    void shouldSearchForDebitCardAndSeeResultsTest() {
            alfaBankPage
                    .openPage()
                    .waitForLoadingSite()
                    .openSearchBar()
                    .setValueToSearchBar()
                    .checkTextResults("Дебетовая карта");
    }
}
