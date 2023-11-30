package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.AccountService;
import lippia.web.services.LogInService;

public class AccountSteps extends PageSteps {
    @When("the client clicks on My Account button")
    public void theClientClicksOnMyAccountButton() {
        LogInService.clickAccountButton();
    }
    @When("the client clicks on Account Details item")
    public void theClientClicksOnAccountDetails() {
        AccountService.clickAccountDetails();
    }
    @Then("the client can view the Account Details page where they can change their information")
    public void theClientCanViewTheAccountDetailsPageWhereTheyCanChangeTheirInformation() {
        AccountService.checkSaveButton();
    }
    @Then("the client can view Log In and Register forms")
    public void theClientCanViewLogInAndRegisterForms() {
        AccountService.verifyForms();
    }
}
