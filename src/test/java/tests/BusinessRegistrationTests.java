package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BusinessRegistrationPage;

@Owner("alexsnp")
@Feature("Действия с вторым блоком главной страницы")
@Tag("Alfa")
public class BusinessRegistrationTests extends TestBase{
        BusinessRegistrationPage businessRegistrationPage = new BusinessRegistrationPage();
        @Test
        @Severity(SeverityLevel.CRITICAL)
        @DisplayName("Проверка перехода на вкладку 'Регистрация бизнеса' через кнопки-табы второго блока")
        void shouldOpenBusinessRegistrationTabTest() {
                businessRegistrationPage
                        .openPage()
                        .selectSmallBusinessTab()
                        .openBusinessRegistrationPage()
                        .checkTextResults("Регистрация бизнеса онлайн");
        }
    }
