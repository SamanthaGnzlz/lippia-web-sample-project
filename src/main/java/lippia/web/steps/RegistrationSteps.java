package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.When;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {
    @When("the client enters email {} in email address textbox")
    public void theClientEntersEmailInEmailAddressBox(String email) {
        RegistrationService.setEmail(email);
    }
    @When("the client enters password {} in password textbox")
    public void theClientEntersPasswordInPasswordBox(String password) {
        RegistrationService.setPassword(password);
        RegistrationService.clickRegisterButton();
    }
}
