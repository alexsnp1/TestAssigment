import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class SimpleTests {
    @BeforeAll
    static void beforeAll() {
//        Configuration.browserSize = "1";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager"; //при долгой загрузке не падает тест
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void simpleTest() {
        open("https://alfabank.ru/");
        sleep(2000);
        $("[data-test-id='TabsHeader-mmb-title']").shouldBe(visible).click();
        $("[data-test-id='mmb_tab']").find("a[href='/sme/start/']")
                .scrollTo().shouldBe(visible).click();
        $$("[data-test-id='text']")
                .findBy(Condition.text("Регистрация бизнеса онлайн")).shouldBe(visible);
    }

    @Test
    void simple2Test() {
        open("https://alfabank.ru/");
        sleep(2000);
        $("[data-test-id='test-ya-button']").shouldBe(visible).click();
        $("[data-test-id='search-input']").setValue("Дебетовая карта").pressEnter();
        sleep(2000);
        $$("[data-test-id='text']")
                .findBy(Condition.text("Дебетовая карта")).shouldBe(visible);
    }

    @Test
    void simple3Test() {
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
    void simple4Test() {
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


}
