package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

import static io.qameta.allure.Allure.step;

@Tag("Alfa")
public class MainPageContentTests extends TestBase {
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldCheckLogo() {
        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Check that logo is visible", () -> {
            alfaBankPage.checkLogo();
        });
    }

    @Test
    void shouldCheckBanner() {
        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Check Text Results", () -> {
            alfaBankPage.checkTextResults("Бесплатная Альфа‑Карта");
        });
    }

    @Test
    void shouldCheckToBecomeAClientButton() {
        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Check To Become A Client Button", () -> {
            alfaBankPage.checkToBecomeAClientButton();
        });
    }

    @Test
    void shouldCheckLoginButton() {
        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Check Login Button", () -> {
            alfaBankPage.checkLoginButton();
        });
    }
    @Test
    void shouldCheckRetailDropdown() {
        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Check Retail Dropdown", () -> {
            alfaBankPage.checkRetailDropdown();
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
}
