package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.EnglishVersionPage;

@Tag("Alfa")
public class EnglishVersionTests extends TestBase{
    EnglishVersionPage englishVersionPage = new EnglishVersionPage();

    @Test
    void shouldOpenEnglishVersionTest() {
        englishVersionPage
                    .openPage()
                    .clickToEnglishLanguageOfSite()
                    .checkTextResults("The most phygital bank");
    }
}
