package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DepositOpeningPage {
    @Step("Открываем главную страницу")
    public DepositOpeningPage openPage() {
        open("https://alfabank.ru/");
        return this;
    }
    @Step("Проверяем, правильность суммы вклада")
    public DepositOpeningPage checkIfAmountValueCorrect() {
        SelenideElement AmountValue = $("[data-test-id='amount-input']")
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", AmountValue);
        AmountValue.shouldHave(value("300 000"));
        return this;
    }
    @Step("Выбираем срок вклада 6 месяцев")
    public DepositOpeningPage set6MonthsDepositTerm() {
        SelenideElement Months6Button = $$("button").findBy(Condition.text("6 месяцев"))
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", Months6Button);
        Selenide.executeJavaScript("arguments[0].click();", Months6Button);
        return this;
    }
    @Step("Отключаем условие 'Новые деньги'")
    public DepositOpeningPage disableNewMoneyConditionCheckbox() {
        SelenideElement newMoneyCheckBox = $(("#calculator .switch__switch_agi88"))
                .should(Condition.appear, Duration.ofSeconds(5))
                .shouldBe(visible, Duration.ofSeconds(5));
        Selenide.executeJavaScript("arguments[0].scrollIntoView(true);", newMoneyCheckBox);
        Selenide.executeJavaScript("arguments[0].click();", newMoneyCheckBox);
        return this;
    }
    @Step("Проверяем правильность расчета процентной ставки")
    public DepositOpeningPage checkIfInterestRateCorrect() {
        $("[data-test-id='interestRate-all']").shouldHave(text("13,50%"));
        return this;
    }

    @Step("Нажимаем на кнопку 'Открыть вклад'")
    public DepositOpeningPage clickToOpenDepositButton() {
        $("[data-test-id='openDepositBtn-rub']").shouldBe(visible, Duration.ofSeconds(5)).click();
        return this;
    }
    @Step("Проверяем текст")
    public DepositOpeningPage checkTextResults(String textResult) {
        $$("[data-test-id='text']")
                .findBy(Condition.text(textResult)).should(Condition.appear, Duration.ofSeconds(8)).shouldBe(visible,
                        Duration.ofSeconds(8));
        return this;
    }
}
