package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BusinessRegistrationPage {
    @Step("Открываем главную страницу")
    public BusinessRegistrationPage openPage() {
        open("https://alfabank.ru/");
        return this;
    }
    @Step("Нажимаем на кнопку'Малому бизнесу'")
    public BusinessRegistrationPage selectSmallBusinessTab() {
        SelenideElement TabsHeader = $("[data-test-id='TabsHeader-mmb-title']")
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", TabsHeader);
        Selenide.executeJavaScript("arguments[0].click();", TabsHeader);
        return this;
    }
    @Step("Нажимаем на поле 'Регистрация бизнеса'")
    public BusinessRegistrationPage openBusinessRegistrationPage() {
        SelenideElement mmb_tab = $("[data-test-id='mmb_tab']").find("a[href='/sme/start/']")
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", mmb_tab);
        Selenide.executeJavaScript("arguments[0].click();", mmb_tab);
        return this;
    }
    @Step("Проверяем текст")
    public BusinessRegistrationPage checkTextResults(String textResult) {
        $$("[data-test-id='text']")
                .findBy(Condition.text(textResult)).should(Condition.appear, Duration.ofSeconds(8)).shouldBe(visible,
                        Duration.ofSeconds(8));
        return this;
    }
}
