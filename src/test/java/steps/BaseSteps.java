package steps;

import Pages.InventoryPage;
import Pages.LoginPage;

public class BaseSteps {

    String BASE_URL = "https://www.saucedemo.com/";
    LoginPage loginPage = new LoginPage();

    InventoryPage inventoryPage = new InventoryPage();
}
