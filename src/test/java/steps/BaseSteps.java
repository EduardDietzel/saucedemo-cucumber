package steps;

import Pages.*;

public class BaseSteps {

    String BASE_URL = "https://www.saucedemo.com/";
    LoginPage loginPage = new LoginPage();

    InventoryPage inventoryPage = new InventoryPage();

    SideBar sideBar = new SideBar();

    YourCartPage yourCartPage = new YourCartPage();

    CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage();

    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();

}
