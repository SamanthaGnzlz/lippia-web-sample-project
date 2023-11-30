package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.RegistrationConstants;

public class RegistrationService {
    public static void setEmail(String email) {
        ActionManager.setInput(RegistrationConstants.EMAIL_INPUT_ID, email);
    }
    public static void setPassword(String password) {
        ActionManager.setInput(RegistrationConstants.PASSWORD_INPUT_ID, password);
    }
    public static void clickRegisterButton() {
        ActionManager.click(RegistrationConstants.REGISTER_BUTTON_XPATH);
    }
}
