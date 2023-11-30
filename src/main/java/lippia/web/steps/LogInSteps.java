package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.BaseService;
import lippia.web.services.LogInService;

public class LogInSteps extends PageSteps {
    @When("the client enters username in username box")
    public void theClientEntersUsernameInUsernameBox() {
        LogInService.setUser(PropertyManager.getProperty("username"));
    }
    @When("the client enters password in password box")
    public void theClientEntersPasswordInPasswordBox() {
        LogInService.setPassword(PropertyManager.getProperty("password"));
    }
    @When("the client clicks on login button")
    public void theClientClicksOnLoginButton() {
        LogInService.clickLogInButton();
    }
    @Then("it displays prompt {}")
    public void itDisplaysPrompt(String prompt) {
        LogInService.verifyPrompt(prompt);
    }
    @When("the client enter username with a case letter in username textbox")
    public void theClientEnterUsernameWithACaseLetterInUsernameTextbox() {
        LogInService.setUser("SamCrowdar");
    }
    @When("the client enter password with a case letter in username textbox")
    public void theClientEnterPasswordWithACaseLetterInUsernameTextbox() {
        LogInService.setPassword("Contrasenia2023");
        LogInService.clickLogInButton();
    }
    @Then("log-in failed")
    public void logInFailed() {
        BaseService.getMyWait();
        LogInService.verifyPrompt("The password you entered for the username SamCrowdar is incorrect");
    }
    @When("the client clicks on logout item")
    public void theClientClicksOnLogoutItem() {
        LogInService.clickLogOutItem();
    }
    @When("the client clicks on back button in browser")
    public void theClientClicksOnBackButtonInBrowser() {
        LogInService.clickBackButton();
    }
    @Then("the client shouldn't be signed in")
    public void theClientShouldnTBeSignedIn() {
        BaseService.getMyWait();
        LogInService.verifyLogOut();
    }
}
