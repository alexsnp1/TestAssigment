package tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.AlfaBankPage;
import java.time.Duration;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
public class SimpleTests extends TestBase {
    AlfaBankPage alfaBankPage = new AlfaBankPage();

    @Test
    void shouldOpenBusinessRegistrationTab() {
        open("https://alfabank.ru/");
        $("[data-test-id='TabsHeader-mmb-title']").scrollTo().should(Condition.appear)
                .shouldBe(visible, Duration.ofSeconds(10)).click();
        $("[data-test-id='mmb_tab']").find("a[href='/sme/start/']")
                .scrollTo().shouldBe(visible).click();
        $$("[data-test-id='text']")
                .findBy(Condition.text("Регистрация бизнеса онлайн")).shouldBe(visible);
    }

    @Test
    void shouldSearchForDebitCardAndSeeResults() {
        open("https://alfabank.ru/");
        sleep(2000);
        $("[data-test-id='test-ya-button']").should(Condition.appear).shouldBe(visible).click();
        $("[data-test-id='search-input']").setValue("Дебетовая карта").pressEnter();
        $$("[data-test-id='text']")
                .findBy(Condition.text("Дебетовая карта")).should(Condition.appear,
                        Duration.ofSeconds(10)).shouldBe(visible);
    }

    @Test
    void shouldNavigateToDepositOpeningPageAfterCalculation() {
        open("https://alfabank.ru/");
        $("[data-test-id='amount-input']").should(Condition.appear).shouldBe(visible).shouldHave(value("300 000"));
        Selenide.executeJavaScript("arguments[0].click();",
                $$("button").findBy(Condition.text("3 месяца")));
        $("#calculator .switch__switch_agi88").click();
        $("[data-test-id='interestRate-all']").shouldHave(text("14,50%"));
        $("[data-test-id='openDepositBtn-rub']").click();
        $$("[data-test-id='text']").
                findBy(Condition.text("Как открыть вклад")).shouldBe(visible);
    }
    @Test
    void shouldNavigateToBusinessAccountOpeningThroughHover () {
        open("https://alfabank.ru/");
        sleep(2000);
        $("[data-test-id='test-sme']").shouldBe(visible,
                Duration.ofSeconds(10)).hover();
        $$("[data-test-id='text']").
                findBy(Condition.text("Расчётный счёт")).hover();
        $$("[data-test-id='text']").
                findBy(Condition.text("Открыть счёт")).click();
        $$("[data-test-id='text']").
                findBy(Condition.text("Заявка на открытие счёта для бизнеса")).shouldBe(visible, Duration.ofSeconds(10));
    }
    @Test
    void shouldOpenEnglishVersion () {
        open("https://alfabank.ru/");
        $("[href='https://alfabank.ru/en/']").should(Condition.appear, Duration.ofSeconds(10)).shouldBe(visible,
                Duration.ofSeconds(10)).click();
        $$("[data-test-id='text']").
                findBy(Condition.text("The most phygital bank")).shouldBe(visible);
    }


}
