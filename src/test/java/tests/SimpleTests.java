package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SimpleTests extends TestBase {

    @Test
    void shouldOpenBusinessRegistrationTab() {
        open("https://alfabank.ru/");
        sleep(2000);
        $("[data-test-id='TabsHeader-mmb-title']").shouldBe(visible).click();
        $("[data-test-id='mmb_tab']").find("a[href='/sme/start/']")
                .scrollTo().shouldBe(visible).click();
        $$("[data-test-id='text']")
                .findBy(Condition.text("Регистрация бизнеса онлайн")).shouldBe(visible);
    }

    @Test
    void shouldSearchForDebitCardAndSeeResults() {
        open("https://alfabank.ru/");
        sleep(2000);
        $("[data-test-id='test-ya-button']").shouldBe(visible).click();
        $("[data-test-id='search-input']").setValue("Дебетовая карта").pressEnter();
        sleep(2000);
        $$("[data-test-id='text']")
                .findBy(Condition.text("Дебетовая карта")).shouldBe(visible);
    }

    @Test
    void shouldNavigateToDepositOpeningPageAfterCalculation() {
        open("https://alfabank.ru/");
        sleep(2000);
        $("[data-test-id='amount-input']")
                .sendKeys(Keys.chord(Keys.COMMAND, "a"), Keys.DELETE);
        $("[data-test-id='amount-input']").setValue("500000");
        Selenide.executeJavaScript("arguments[0].click();",
                $$("button").findBy(Condition.text("6 месяцев")));
        $("[data-test-id='openDepositBtn-rub']").click();
        $$("[data-test-id='text']").
                findBy(Condition.text("Как открыть вклад")).shouldBe(visible);
    }
    @Test
    void shouldNavigateToBusinessAccountOpeningThroughHover () {
        open("https://alfabank.ru/");
        sleep(2000);
        $("[data-test-id='test-sme']").hover();
        $$("[data-test-id='text']").
                findBy(Condition.text("Расчётный счёт")).hover();
        $$("[data-test-id='text']").
                findBy(Condition.text("Открыть счёт")).click();
        sleep(1000);
        $$("[data-test-id='text']").
                findBy(Condition.text("Заявка на открытие счёта для бизнеса")).shouldBe(visible);
    }
    @Test
    void shouldOpenEnglishVersion () {
        open("https://alfabank.ru/");
        sleep(2000);
        $("[href='https://alfabank.ru/en/']").click();
        $$("[data-test-id='text']").
                findBy(Condition.text("The most phygital bank")).shouldBe(visible);
    }


}
