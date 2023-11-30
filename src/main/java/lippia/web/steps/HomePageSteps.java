package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BaseService;
import lippia.web.services.HomePageService;

public class HomePageSteps extends PageSteps {
    @Given("the client is on automationtesting page")
    public void home() {
        HomePageService.navigateWeb();
    }
    @When("the client clicks on Shop button")
    public void theClientClicksOnShopButton() {
        HomePageService.clickShopButton();
    }
    @When("the client clicks on a product's image in new arrivals section")
    public void theClientClicksOnAProductSImageInNewArrivalsSection() {
        BaseService.getMyWait();
        HomePageService.clickOnImage();
    }
    @When("the client clicks on Add to Basket button")
    public void theClientClicksOnAddToBasketButton() {
        HomePageService.clickAddToBasketButton();
    }
    @Then("the client can view the Total and Subtotal values")
    public void theClientCanViewTheTotalAndSubtotalValues() {
        HomePageService.checkValues();
    }
    @Then("the client can view the Apply Coupon button")
    public void theClientCanViewTheApplyCouponButton() {
        HomePageService.checkApplyCouponButton();
    }
    @When("the client clicks on Proceed to Checkout button")
    public void theClientClicksOnProceedToCheckoutButton() {
        HomePageService.clickCheckoutButton();
    }
    @When("the client enters their details in the billing form")
    public void theClientEntersTheirDetailsInTheBillingForm() {
        HomePageService.fillBillingForm();
    }
    @When("the client clicks on Item button on navbar")
    public void theClientClicksOnItemButtonOnNavbar() {
        HomePageService.clickItemButton();
    }
    @When("the client choose check payment method")
    public void theClientChooseCheckPaymentMethod() {
        HomePageService.choosePayment();
    }
    @When("the client clicks on Place Order button")
    public void theClientClicksOnPlaceOrderButton() {
        BaseService.getMyWait();
        HomePageService.clickPlaceOrderButton();
    }
    @Then("Order Details are shown")
    public void orderDetailsAreShown() {
        HomePageService.checkDetails();
    }
}
