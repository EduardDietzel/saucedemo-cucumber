package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class YourCartPage {

    public SelenideElement cartList = $(byXpath("//div[@class='cart_list']"));

    public SelenideElement checkoutButton = $(byId("checkout"));
}
