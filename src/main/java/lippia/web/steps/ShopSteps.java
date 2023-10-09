package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ShopService;

public class ShopSteps extends PageSteps {

    //region home page feature
    @Given("the client is on automationtesting page")
    public void home() {
        ShopService.navigateWeb();
    }

    @When("the client clicks on Shop button")
    public void theClientClicksOnShopButton() {
        ShopService.clickShopButton();
    }

    @When("the client clicks on Home button")
    public void theClientClicksOnHomeButton() {
        ShopService.clickHomeButton();
    }

    @When("the client clicks on a product's image in new arrivals section")
    public void theClientClicksOnAProductSImageInNewArrivalsSection() {
        ShopService.clickOnImage();
    }

    @When("the client clicks on Reviews button")
    public void theClientClicksOnReviewsButton() {
        ShopService.clickReviewButton();
    }

    @Then("the client can view the three Arrivals")
    public void theClientCanViewTheThreeArrivals() {
        ShopService.checkThreeArrivals();
    }

    @Then("the client is on the book page and can add it to the basket")
    public void theClientIsOnTheBookPageAndCanAddItToTheBasket() {
        ShopService.checkBasketButton();
    }

    @Then("the product's review are shown")
    public void theProductsReviewAreShown() {
        ShopService.checkReviews();
    }
    //endregion

    //region shop feature
    @When("the client clicks on HTML from Product Categories")
    public void theClientClicksOnHTMLFromProductCategories() {
        ShopService.clickOnCategory();
    }

    @When("the client clicks on {} the sorting dropdown")
    public void theClientClicksOnTheSortingDropdown(String option) {
        ShopService.clickDropdown(option);
    }

    @When("the client clicks on a product with Sale! tag")
    public void theClientClicksOnAProductWithTag() {
        ShopService.clickOnSale();
    }

    @Then("the client can view products from HTML category")
    public void theClientCanViewProductsFromHTMLCategory() {
        ShopService.checkHTMLURL();
    }

    @Then("the client can view the products sorted by {}")
    public void theClientCanViewTheProductsSortedBy(String filter) {
        ShopService.checkFilterURL(filter);
    }

    @Then("the client can view both sale price and full price")
    public void theClientCanViewBothSalePriceAndFullPrice() {
        ShopService.checkPrices();
    }
    //endregion

    //region login feature
    @When("the client enters username in username box")
    public void theClientEntersUsernameInUsernameBox() {
        ShopService.setUser(PropertyManager.getProperty("username"));
    }

    @When("the client enters password in password box")
    public void theClientEntersPasswordInPasswordBox() {
        ShopService.setPassword(PropertyManager.getProperty("password"));
    }

    @When("the client clicks on login button")
    public void theClientClicksOnLoginButton() {
        ShopService.clickLogInButton();
    }

    @When("the client enters username {} in username box")
    public void theClientEntersUsernameInUsernameBox(String username) {
        ShopService.setUser(username);
    }

    @When("the client enters password {} in password box")
    public void theClientEntersPasswordInPasswordBox(String password) {
        ShopService.setPassword(password);
        ShopService.clickLogInButton();
    }

    @Then("the client is logged in")
    public void theClientIsLoggedIn() {
        ShopService.checkLogIn();
    }

    @Then("it displays prompt {}")
    public void itDisplaysPrompt(String prompt) {
        ShopService.verifyPrompt(prompt);
    }

    @Then("the password field should display the characters in bullets")
    public void thePasswordFieldShouldDisplayTheCharactersInBullets() {
        ShopService.checkPasswordType();
    }
    //endregion

    //region my account feature
    @When("the client clicks on My Account button")
    public void theClientClicksOnMyAccountButton() {
        ShopService.clickAccountButton();
    }

    @When("the client clicks on Dashboard item")
    public void theClientClicksOnDashboardItem() {
        ShopService.clickDashboard();
    }

    @When("the client clicks on Account Details item")
    public void theClientClicksOnAccountDetails() {
        ShopService.clickAccountDetails();
    }

    @When("the client clicks on Addresses item")
    public void theClientClicksOnAddressesItem() {
        ShopService.clickAdresses();
    }

    @Then("the client can view the Account Details page where they can change their information")
    public void theClientCanViewTheAccountDetailsPageWhereTheyCanChangeTheirInformation() {
        ShopService.checkSaveButton();
    }

    @Then("the client can view the Dashboard page")
    public void theClientCanViewTheDashboardPage() {
        ShopService.checkDashboard();
    }

    @Then("the client can view the Billing Address and Shipping Address")
    public void theClientCanViewTheBillingAddressAndShippingAddress() {
        ShopService.checkAddresses();
    }
    //endregion
}
