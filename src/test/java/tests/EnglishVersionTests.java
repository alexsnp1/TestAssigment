package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.EnglishVersionPage;

@Owner("alexsnp")
@Feature("Переключение на англоязычную версию сайта")
@Tag("Alfa")
public class EnglishVersionTests extends TestBase{
    EnglishVersionPage englishVersionPage = new EnglishVersionPage();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверка открытия англоязычной версии сайта по кнопке переключения языка")
    void shouldOpenEnglishVersionTest() {
        englishVersionPage
                    .openPage()
                    .clickToEnglishLanguageOfSite()
                    .checkTextResults("The most phygital bank");
    }
}
