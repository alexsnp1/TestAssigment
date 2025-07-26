package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class AlfaBankPage {

    public AlfaBankPage openPage() {
        open("https://alfabank.ru/");
        return this;

    }

    public AlfaBankPage removeStringValue() {
        $("[data-test-id='amount-input']")
                .sendKeys(Keys.chord(Keys.COMMAND, "a"), Keys.DELETE);
        return this;

    }

    public AlfaBankPage ope2nPge() {
        open("https://alfabank.ru/");
        return this;

    }

    public AlfaBankPage ope3nPae() {
        open("https://alfabank.ru/");
        return this;

    }

    public AlfaBankPage Press6MonthsButton() {
        Selenide.executeJavaScript("arguments[0].click();",
                $$("button").findBy(Condition.text("6 месяцев")));
        return this;
    }
}
