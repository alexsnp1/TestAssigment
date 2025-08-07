package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tag("Alfa")
public class MainPageContentTests extends TestBase {
    MainPage mainpage = new MainPage();

    @Test
    void shouldCheckLogoTest() {
        mainpage
                    .openPage()
                    .checkLogo();
    }

    @Test
    void shouldCheckBannerTest() {
        mainpage
                    .openPage()
                    .checkTextResults("Бесплатная Альфа‑Карта");
    }

    @Test
    void shouldCheckToBecomeAClientButtonTest() {
        mainpage
                    .openPage()
                    .checkToBecomeAClientButton();
    }

    @Test
    void shouldCheckLoginButtonTest() {
        mainpage
                    .openPage()
                    .checkLoginButton();
    }
    @Test
    void shouldCheckRetailDropdownTest() {
        mainpage
                    .openPage()
                    .checkRetailDropdown();
    }
    @Test
    void shouldSearchForDebitCardAndSeeResultsTest() {
        mainpage
                    .openPage()
                    .waitForLoadingSite()
                    .openSearchBar()
                    .setValueToSearchBar()
                    .checkTextResults("Дебетовая карта");
    }
}
