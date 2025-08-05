package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

import static io.qameta.allure.Allure.step;

@Tag("Alfa")
public class EnglishVersionPage extends TestBase{
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldOpenEnglishVersionTest() {
            alfaBankPage
                    .openPage()
                    .clickToEnglishLanguageOfSite()
                    .checkTextResults("The most phygital bank");
    }
}
