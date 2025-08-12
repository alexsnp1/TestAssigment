package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Owner("alexsnp")
@Feature("Быстрые проверка наполнения главной страницы сайта")
@Tag("Alfa")
public class MainPageContentTests extends TestBase {
    MainPage mainpage = new MainPage();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка отображения логотипа")
    void shouldCheckLogoTest() {
        mainpage
                    .openPage()
                    .checkLogo();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка отображения баннера")
    void shouldCheckBannerTest() {
        mainpage
                    .openPage()
                    .checkTextResults("Бесплатная Альфа‑Карта");
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка отображения кнопки регистрации")
    void shouldCheckToBecomeAClientButtonTest() {
        mainpage
                    .openPage()
                    .checkToBecomeAClientButton();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка отображения кнопки 'Войти'")
    void shouldCheckLoginButtonTest() {
        mainpage
                    .openPage()
                    .checkLoginButton();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка отображения кнопки 'Частным лицам' в верхнем меню")
    void shouldCheckRetailDropdownTest() {
        mainpage
                    .openPage()
                    .checkRetailDropdown();
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка работы поиска")
    void shouldSearchForDebitCardAndSeeResultsTest() {
        mainpage
                    .openPage()
                    .waitForLoadingSite()
                    .openSearchBar()
                    .setValueToSearchBar()
                    .checkTextResults("Дебетовая карта");
    }
}