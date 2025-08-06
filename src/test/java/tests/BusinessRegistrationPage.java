package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

@Tag("Alfa")
public class BusinessRegistrationPage extends TestBase{
        AlfaBankPage alfaBankPage = new AlfaBankPage();

        @Test
        void shouldOpenBusinessRegistrationTabTest() {
                alfaBankPage
                        .openPage()
                        .selectSmallBusinessTab()
                        .openBusinessRegistrationPage()
                        .checkTextResults("Регистрация бизнеса онлайн");
        }
    }
