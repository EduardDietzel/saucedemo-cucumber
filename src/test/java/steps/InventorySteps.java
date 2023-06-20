package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static java.lang.Double.parseDouble;
import static java.util.Collections.sort;
import static java.util.Comparator.*;
import static java.util.Comparator.reverseOrder;
import static org.junit.Assert.assertEquals;

public class InventorySteps extends BaseSteps{

    @Then("^I am on the page Inventory$")
    public void iAmOnThePageInventory() {
        inventoryPage.inventoryList.shouldBe(visible);
    }

    @When("^I push Add to cart button of backpack$")
    public void iPushAddToCartButtonOfBackpack() {
        inventoryPage.addToCart.shouldBe(visible).click();
    }

    @And("^I push the Card icon$")
    public void iPushTheCardIcon() {
        inventoryPage.cartIcon.shouldBe(visible).click();
    }

    @Then("^inventory item quantity is (\\d+)$")
    public void inventoryItemQuantityIs(int expectedItemQuantity) {
        // check that quantity is 6
        inventoryPage.inventoryItems.filterBy(visible).shouldHave(size(expectedItemQuantity));
    }

    @And("^al inventory items are displayed$")
    public void alInventoryItemsAreDisplayed(int expectedItemQuantity) {
        inventoryPage.inventoryItems.filterBy(visible).shouldHave(size(expectedItemQuantity));
    }

//    @And("^al inventory items are displayed$")
//    public void alInventoryItemsAreDisplayed() {
//        for (SelenideElement item : inventoryPage.inventoryItems) {
//            item.shouldBe(visible);
//        }
//    }

    @When("^I choose sorting option by name A-Z$")
    public void iChooseSortingOptionByNameAZ() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionAZ.shouldBe(visible).click();
    }

    @Then("^all items names are sorted alphabetically$")
    public void allItemsNamesAreSortedAlphabetically() {
        List<String> actualNames = new ArrayList<>();
        // actualNames - список названий продуктов
        for (SelenideElement itemName : inventoryPage.itemNames) {
            actualNames.add(itemName.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        assertEquals(expectedNames, actualNames);
    }

    @When("^I choose sorting option by name Z-A$")
    public void iChooseSortingOptionByNameZA() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionZA.shouldBe(visible).click();
    }

    @Then("^all items names are sorted in reverse alphabetical$")
    public void allItemsNamesAreSortedInReverseAlphabetical() {
        // List<String> actualNames = new ArrayList<>();
        List<String> expectedNames = new ArrayList<>();
        for (SelenideElement itemName : inventoryPage.itemNames) {
            expectedNames.add(itemName.getText());
        }
        sort(expectedNames, reverseOrder());
        // assertEquals(expectedNames, actualNames);
        inventoryPage.itemNames.shouldHave(exactTexts(expectedNames));
    }

    @When("^I choose sorting option by price from low to high$")
    public void iChooseSortingOptionByPriceFromLowToHigh() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionLowToHigh.shouldBe(visible).click();
    }

    @Then("^all items are sorted by price from low to high$")
    public void allItemsAreSortedByPriceFromLowToHigh() {
        List<Double> actualPrices = new ArrayList<>();
        for (SelenideElement itemPrice : inventoryPage.itemPrices) {
            actualPrices.add(parseDouble(itemPrice.getText().substring(1)));
        }
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        sort(expectedPrices);
        System.out.println(expectedPrices);
        System.out.println(actualPrices);
        assertEquals(expectedPrices, actualPrices);
    }

//    @Then("^all prices are sorted from low to high$")
//    public void allPricesAreSortedFromLowToHigh() {
//        List<Double> actualPrices = new ArrayList<>();
//        for (SelenideElement itemPrice: inventoryPage.itemPrices) {
//            actualPrices.add(parseDouble(itemPrice.getText().substring(1)));
//        }
//        List<Double> expectedPrices = new ArrayList<>(actualPrices);
//        sort(expectedPrices);
//        List <String> expectedPricesText = new ArrayList<>();
//        for (Double value:expectedPrices) {
//            expectedPricesText.add(value.toString());
//        }
//        inventoryPage.itemPrices.shouldHave(texts(expectedPricesText));
//    }


    @When("^I choose sorting option by price from high to low$")
    public void iChooseSortingOptionByPriceFromHighToLow() {
        inventoryPage.sortDropdown.click();
        inventoryPage.optionHighToLow.shouldBe(visible).click();
    }


    @Then("^all items are sorted by price from high to low$")
    public void allItemsAreSortedByPriceFromHighToLow() {
        List<Double> actualPrices = new ArrayList<>();
        for (SelenideElement itemPrice : inventoryPage.itemPrices) {
            actualPrices.add(parseDouble(itemPrice.getText().substring(1)));
        }
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        sort(expectedPrices, reverseOrder());
        System.out.println(expectedPrices);
        System.out.println(actualPrices);
        assertEquals(expectedPrices, actualPrices);
    }
}
