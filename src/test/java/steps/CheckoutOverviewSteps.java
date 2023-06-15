package steps;

import com.codeborne.selenide.Condition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class CheckoutOverviewSteps extends BaseSteps{

    @Then("^I am on the page Checkout: Overview$")
    public void iAmOnThePageCheckoutOverview() {
        checkoutOverviewPage.finishButton.shouldBe(visible);
    }

    @When("^I push Finish button$")
    public void iPushFinishButton() {
        checkoutOverviewPage.finishButton.click();
    }

    @Then("^message with text \"([^\"]*)\" is displayed$")
    public void messageWithTextIsDisplayed(String expectedText) {
        // Write code here that turns the phrase above into concrete actions
        checkoutOverviewPage.completeText.shouldBe(visible);
        checkoutOverviewPage.completeText.shouldHave(text(expectedText));
    }
}
