package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class AlfaBankPage {

    @Step("Открываем главную страницу")
    public AlfaBankPage openPage() {
        open("https://alfabank.ru/");
        return this;
    }

    @Step("Проверяем текст")
    public AlfaBankPage checkTextResults(String textResult) {
        $$("[data-test-id='text']")
                .findBy(Condition.text(textResult)).should(Condition.appear, Duration.ofSeconds(8)).shouldBe(visible,
                        Duration.ofSeconds(8));
        return this;
    }
    @Step("Нажимаем на кнопку'Малому бизнесу'")
    public AlfaBankPage selectSmallBusinessTab() {
        SelenideElement TabsHeader = $("[data-test-id='TabsHeader-mmb-title']")
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", TabsHeader);
        Selenide.executeJavaScript("arguments[0].click();", TabsHeader);
        return this;
    }
    @Step("Нажимаем на поле 'Регистрация бизнеса'")
    public AlfaBankPage openBusinessRegistrationPage() {
        SelenideElement mmb_tab = $("[data-test-id='mmb_tab']").find("a[href='/sme/start/']")
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", mmb_tab);
        Selenide.executeJavaScript("arguments[0].click();", mmb_tab);
        return this;
    }
    @Step("Открываем поисковую строку")
    public AlfaBankPage openSearchBar() {
        $("[data-test-id='test-ya-button']").should(Condition.appear).shouldBe(visible).click();
        return this;
    }
    @Step("Ожидаем загрузки сайта")
    public AlfaBankPage waitForLoadingSite() {
        sleep(2000);
        return this;
    }
    @Step("Вводим значение в поисковую строку")
    public AlfaBankPage setValueToSearchBar() {
        $("[data-test-id='search-input']").setValue("Дебетовая карта").pressEnter();
        return this;
    }
    @Step("Проверяем, правильность суммы вклада")
    public AlfaBankPage checkIfAmountValueCorrect() {
        SelenideElement AmountValue = $("[data-test-id='amount-input']")
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", AmountValue);
        AmountValue.shouldHave(value("300 000"));
        return this;
    }
    @Step("Выбираем срок вклада 6 месяцев")
    public AlfaBankPage set6MonthsDepositTerm() {
        SelenideElement Months6Button = $$("button").findBy(Condition.text("6 месяцев"))
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", Months6Button);
        Selenide.executeJavaScript("arguments[0].click();", Months6Button);
        return this;
    }
    @Step("Отключаем условие 'Новые деньги'")
    public AlfaBankPage disableNewMoneyConditionCheckbox() {
        SelenideElement newMoneyCheckBox = $(("#calculator .switch__switch_agi88"))
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", newMoneyCheckBox);
        Selenide.executeJavaScript("arguments[0].click();", newMoneyCheckBox);
        return this;
    }
    @Step("Проверяем правильность расчета процентной ставки")
    public AlfaBankPage checkIfInterestRateCorrect() {
        $("[data-test-id='interestRate-all']").shouldHave(text("13,50%"));
        return this;
    }

    @Step("Нажимаем на кнопку 'Открыть вклад'")
    public AlfaBankPage clickToOpenDepositButton() {
        $("[data-test-id='openDepositBtn-rub']").shouldBe(visible, Duration.ofSeconds(5)).click();
        return this;
    }
    @Step("Наводимся на верхнее таб-меню 'Малому бизнесу и ИП'")
    public AlfaBankPage hoverToSmallBusinessAndIE() {
        $("[data-test-id='test-sme']").shouldBe(visible,
                Duration.ofSeconds(5)).hover();
        return this;
    }
    @Step("Наводимся на вкладку 'Расчетный счет'")
    public AlfaBankPage hoverToBusinessAccount() {
        $$("[data-test-id='text']").
                findBy(Condition.text("Расчётный счёт")).hover();
        return this;
    }
    @Step("Нажимаем на кнопку 'Открыть счет'")
    public AlfaBankPage clickToOpenAccountButton() {
        $$("[data-test-id='text']").
                findBy(Condition.text("Открыть счёт")).click();
        return this;
    }
    @Step("Нажимаем на кнопку английской версии сайта")
    public AlfaBankPage clickToEnglishLanguageOfSite() {
        SelenideElement englishButton = $("[href='https://alfabank.ru/en/']")
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", englishButton);
        Selenide.executeJavaScript("arguments[0].click();", englishButton);
        return this;
    }
    @Step("Проверяем отображение логотипа")
    public AlfaBankPage checkLogo() {
        $("[title='alfaIcon']").should(visible);
        return this;
    }
    @Step("Проверяем отображение кнопки 'Стать клиентом'")
    public AlfaBankPage checkToBecomeAClientButton() {
        $$("a").findBy(Condition.text("Стать клиентом"))
                .shouldBe(visible);
        return this;
    }
    @Step("Проверяем отображение кнопки 'Войти'")
    public AlfaBankPage checkLoginButton() {
        $$("button").findBy(Condition.text("Войти"))
                .shouldBe(visible);
        return this;
    }
    @Step("Проверяем отображение 'Частным лицам' в верхнем таб-меню")
    public AlfaBankPage checkRetailDropdown() {
        $("[data-test-id='test-retail']")
                .shouldHave(Condition.text("Частным лицам")).shouldBe(visible);
        return this;
    }
}
