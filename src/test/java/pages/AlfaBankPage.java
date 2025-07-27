package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AlfaBankPage {

    public AlfaBankPage openPage() {
        open("https://alfabank.ru/");
        return this;

    }

    public AlfaBankPage checkTextResults(String textResult) {
        $$("[data-test-id='text']")
                .findBy(Condition.text(textResult)).should(Condition.appear, Duration.ofSeconds(10)).shouldBe(visible,
                        Duration.ofSeconds(10));
        return this;

    }

    public AlfaBankPage selectSmallBusinessTab() {
        $("[data-test-id='TabsHeader-mmb-title']").scrollTo().should(Condition.appear)
                .shouldBe(visible, Duration.ofSeconds(10)).click();
        return this;

    }

    public AlfaBankPage openBusinessRegistrationPage() {
        $("[data-test-id='mmb_tab']").find("a[href='/sme/start/']")
                .scrollTo().shouldBe(visible).click();
        return this;

    }

    public AlfaBankPage openSearchBar() {
        $("[data-test-id='test-ya-button']").should(Condition.appear).shouldBe(visible).click();
        return this;
    }

    public AlfaBankPage waitForLoadingSite() {
        sleep(2000);
        return this;
        // не смог решить ни одним доступным мне способом кроме этого, буду рад новым идеям
    }

    public AlfaBankPage setValueToSearchBar() {
        $("[data-test-id='search-input']").setValue("Дебетовая карта").pressEnter();
        return this;
    }

    public AlfaBankPage checkIfAmountValueCorrect() {
        $("[data-test-id='amount-input']").should(Condition.appear).shouldBe(visible).shouldHave(value("300 000"));
        return this;
    }

    public AlfaBankPage set3MonthsDepositTerm() {
        Selenide.executeJavaScript("arguments[0].click();",
                $$("button").findBy(Condition.text("3 месяца")));
        return this;
    }

    public AlfaBankPage disableNewMoneyConditionCheckbox() {
        $("#calculator .switch__switch_agi88").click();
        return this;
    }

    public AlfaBankPage checkIfInterestRateCorrect() {
        $("[data-test-id='interestRate-all']").shouldHave(text("14,50%"));
        return this;
    }

    public AlfaBankPage clickToOpenDepositButton() {
        $("[data-test-id='openDepositBtn-rub']").click();
        return this;
    }

    public AlfaBankPage hoverToSmallBusinessAndIE() {
        $("[data-test-id='test-sme']").shouldBe(visible,
                Duration.ofSeconds(10)).hover();
        return this;
    }

    public AlfaBankPage hoverToBusinessAccount() {
        $$("[data-test-id='text']").
                findBy(Condition.text("Расчётный счёт")).hover();
        return this;
    }

    public AlfaBankPage clickToOpenAccountButton() {
        $$("[data-test-id='text']").
                findBy(Condition.text("Открыть счёт")).click();
        return this;
    }

    public AlfaBankPage clickToEnglishLanguageOfSite() {
        $("[href='https://alfabank.ru/en/']").should(Condition.appear, Duration.ofSeconds(10)).shouldBe(visible,
                Duration.ofSeconds(10)).click();
        return this;
    }
}
