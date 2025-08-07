package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BusinessRegistrationPage;

@Tag("Alfa")
public class BusinessRegistrationTests extends TestBase{
        BusinessRegistrationPage businessRegistrationPage = new BusinessRegistrationPage();

        @Test
        void shouldOpenBusinessRegistrationTabTest() {
                businessRegistrationPage
                        .openPage()
                        .selectSmallBusinessTab()
                        .openBusinessRegistrationPage()
                        .checkTextResults("Регистрация бизнеса онлайн");
        }
    }
