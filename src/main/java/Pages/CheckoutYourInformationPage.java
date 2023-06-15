package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutYourInformationPage {

    public SelenideElement checkoutInfoForm = $(byXpath("//div[@class='checkout_info']"));

    public SelenideElement firstNameField = $(byId("first-name"));

    public SelenideElement lastNameField = $(byId("last-name"));

    public SelenideElement zipPostalCode = $(byId("postal-code"));

    public SelenideElement submitButton = $(byId("continue"));
}
