package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.*;

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
}
