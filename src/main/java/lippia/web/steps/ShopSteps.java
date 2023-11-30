package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.ShopConstants;
import lippia.web.services.BaseService;
import lippia.web.services.ShopService;
import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;

public class ShopSteps extends PageSteps {
    @When("the client clicks on Add to Basket button on a product")
    public void theClientClicksOnAddToBasketButtonOnAProduct() {
        ShopService.clickAddtoBasket();
    }
    @When("^the client enter (.*) on country textbox$")
    public void theClientEnterOnCountryTextbox(String country) {
        ShopService.enterCountry(country);
    }
    @Then("^tax rate should be (.*)% for (.*)$")
    public void taxRateShouldBeFor(Double percentage, String country) {
        ShopService.checkTaxPercentage(percentage);
    }
}
