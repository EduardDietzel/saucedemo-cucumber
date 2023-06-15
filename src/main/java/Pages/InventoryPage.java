package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    public SelenideElement inventoryList = $(byClassName("inventory_list"));

    public SelenideElement sauceLabsBackpack = $(byXpath("(//div[@class='inventory_item'])[1]"));

    public SelenideElement addToCart = $(byId("add-to-cart-sauce-labs-backpack"));

    public SelenideElement cartIcon = $(byXpath("//a[@class='shopping_cart_link']"));


}
