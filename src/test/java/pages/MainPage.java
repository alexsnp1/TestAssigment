package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open("https://alfabank.ru/");
        return this;
    }
    @Step("Проверяем отображение логотипа")
    public MainPage checkLogo() {
        $("[title='alfaIcon']").should(visible);
        return this;
    }
    @Step("Проверяем текст")
    public MainPage checkTextResults(String textResult) {
        $$("[data-test-id='text']")
                .findBy(Condition.text(textResult)).should(Condition.appear, Duration.ofSeconds(8)).shouldBe(visible,
                        Duration.ofSeconds(8));
        return this;
    }
    @Step("Проверяем отображение кнопки 'Стать клиентом'")
    public MainPage checkToBecomeAClientButton() {
        $$("a").findBy(Condition.text("Стать клиентом"))
                .shouldBe(visible);
        return this;
    }
    @Step("Проверяем отображение кнопки 'Войти'")
    public MainPage checkLoginButton() {
        $$("button").findBy(Condition.text("Войти"))
                .shouldBe(visible);
        return this;
    }
    @Step("Проверяем отображение 'Частным лицам' в верхнем таб-меню")
    public MainPage checkRetailDropdown() {
        $("[data-test-id='test-retail']")
                .shouldHave(Condition.text("Частным лицам")).shouldBe(visible);
        return this;
    }
    @Step("Ожидаем загрузки сайта")
    public MainPage waitForLoadingSite() {
        sleep(2000);
        return this;
    }
    @Step("Открываем поисковую строку")
    public MainPage openSearchBar() {
        $("[data-test-id='test-ya-button']").should(Condition.appear).shouldBe(visible).click();
        return this;
    }
    @Step("Вводим значение в поисковую строку")
    public MainPage setValueToSearchBar() {
        $("[data-test-id='search-input']").setValue("Дебетовая карта").pressEnter();
        return this;
    }
}
