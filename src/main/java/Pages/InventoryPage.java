package Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InventoryPage {

    public SelenideElement inventoryList = $(byClassName("inventory_list"));

    public SelenideElement sauceLabsBackpack = $(byXpath("(//div[@class='inventory_item'])[1]"));

    public SelenideElement addToCart = $(byId("add-to-cart-sauce-labs-backpack"));

    public SelenideElement cartIcon = $(byXpath("//a[@class='shopping_cart_link']"));

    public ElementsCollection inventoryItems = $$(byClassName("inventory_item"));

    public ElementsCollection itemNames = $$(byClassName("inventory_item_name"));
    // itemNames - это коллекция селенид-элементов

    public ElementsCollection itemPrices = $$(byClassName("inventory_item_price"));

    public SelenideElement sortDropdown = $(byAttribute("data-test", "product_sort_container"));

    public SelenideElement optionAZ = $(byCssSelector("option[value='az']"));

    public SelenideElement optionZA = $(byCssSelector("option[value='za']"));

    public SelenideElement optionLowToHigh = $(byCssSelector("option[value='lohi']"));

    public SelenideElement optionHighToLow = $(byCssSelector("option[value='hilo']"));

}
