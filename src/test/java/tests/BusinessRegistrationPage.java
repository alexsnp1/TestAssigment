package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

import static io.qameta.allure.Allure.step;
@Tag("Alfa")
public class BusinessRegistrationPage extends TestBase{
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
    }
