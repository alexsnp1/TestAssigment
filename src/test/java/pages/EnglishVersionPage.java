package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class EnglishVersionPage {
    @Step("Открываем главную страницу")
    public EnglishVersionPage openPage() {
        open("https://alfabank.ru/");
        return this;
    }
    @Step("Нажимаем на кнопку английской версии сайта")
    public EnglishVersionPage clickToEnglishLanguageOfSite() {
        SelenideElement englishButton = $("[href='https://alfabank.ru/en/']")
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", englishButton);
        Selenide.executeJavaScript("arguments[0].click();", englishButton);
        return this;
    }
    @Step("Проверяем текст")
    public EnglishVersionPage checkTextResults(String textResult) {
        $$("[data-test-id='text']")
                .findBy(Condition.text(textResult)).should(Condition.appear, Duration.ofSeconds(8)).shouldBe(visible,
                        Duration.ofSeconds(8));
        return this;
    }
}
