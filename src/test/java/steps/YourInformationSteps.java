package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.visible;

public class YourInformationSteps extends BaseSteps{

    @Then("^I am on the page Checkout Your Information$")
    public void iAmOnThePageCheckoutYourInformation() {
        checkoutYourInformationPage.checkoutInfoForm.shouldBe(visible);
    }

    @When("^I input \"([^\"]*)\" to First name field$")
    public void iInputToFirstNameField(String firstnameValue) {
        checkoutYourInformationPage.firstNameField.setValue(firstnameValue);
    }

    @And("^I input \"([^\"]*)\" to Last name field$")
    public void iInputToLastNameField(String lastnameValue) {
        checkoutYourInformationPage.lastNameField.setValue(lastnameValue);
    }

    @And("^I input \"([^\"]*)\" to Zip/postal code field$")
    public void iInputToZipPostalCodeField(String zipPostalCodeValue) {
        checkoutYourInformationPage.zipPostalCode.setValue(zipPostalCodeValue);
    }

    @When("^I push Continue button$")
    public void iPushContinueButton() {
        checkoutYourInformationPage.submitButton.shouldBe(visible).click();
    }

}
