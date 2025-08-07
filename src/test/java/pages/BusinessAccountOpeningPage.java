package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BusinessAccountOpeningPage {

    @Step("Открываем главную страницу")
    public BusinessAccountOpeningPage openPage() {
        open("https://alfabank.ru/");
        return this;
    }
    @Step("Ожидаем загрузки сайта")
    public BusinessAccountOpeningPage waitForLoadingSite() {
        sleep(2000);
        return this;
    }
    @Step("Наводимся на верхнее таб-меню 'Малому бизнесу и ИП'")
    public BusinessAccountOpeningPage hoverToSmallBusinessAndIE() {
        $("[data-test-id='test-sme']").shouldBe(visible,
                Duration.ofSeconds(5)).hover();
        return this;
    }
    @Step("Наводимся на вкладку 'Расчетный счет'")
    public BusinessAccountOpeningPage hoverToBusinessAccount() {
        $$("[data-test-id='text']").
                findBy(Condition.text("Расчётный счёт")).hover();
        return this;
    }
    @Step("Нажимаем на кнопку 'Открыть счет'")
    public BusinessAccountOpeningPage clickToOpenAccountButton() {
        $$("[data-test-id='text']").
                findBy(Condition.text("Открыть счёт")).click();
        return this;
    }
    @Step("Проверяем текст")
    public BusinessAccountOpeningPage checkTextResults(String textResult) {
        $$("[data-test-id='text']")
                .findBy(Condition.text(textResult)).should(Condition.appear, Duration.ofSeconds(8)).shouldBe(visible,
                        Duration.ofSeconds(8));
        return this;
    }
}
