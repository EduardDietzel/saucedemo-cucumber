package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.visible;

public class YourCartSteps extends BaseSteps{

    @Then("^I am on the page YourCard$")
    public void iAmOnThePageYourCard() {
        yourCartPage.cartList.shouldBe(visible);
    }

    @When("^I push Checkout button$")
    public void iPushCheckoutButton() {
        yourCartPage.checkoutButton.shouldBe(visible).click();
    }

}
