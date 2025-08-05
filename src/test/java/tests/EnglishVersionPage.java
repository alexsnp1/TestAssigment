package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;

import static io.qameta.allure.Allure.step;

@Tag("Alfa")
public class EnglishVersionPage extends TestBase{
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldOpenEnglishVersion() {
        step("Open page", () -> {
            alfaBankPage.openPage();
        });
        step("Click To English Language Of Site", () -> {
            alfaBankPage.clickToEnglishLanguageOfSite();
        });
        step("Check Text Results", () -> {
            alfaBankPage.checkTextResults("The most phygital bank");
        });
    }
}
