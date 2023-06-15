package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.visible;

public class SideBarSteps extends BaseSteps{

    @And("^click on burger menu$")
    public void clickOnBurgerMenu() {
        sideBar.burgerMenu.shouldBe(visible).click();
    }

    @When("^I follow the Logout link$")
    public void iFollowTheLogoutLink() {
        sideBar.logoutLink.shouldBe(visible).click();
    }
}
