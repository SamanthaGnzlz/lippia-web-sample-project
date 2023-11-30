package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.AccountConstants;
import org.testng.Assert;

public class AccountService {
    public static void clickAccountDetails() {
        ActionManager.click(AccountConstants.ACCOUNTDETAILS_XPATH);
    }
    public static void checkSaveButton() {
        boolean buttonIsVisible = ActionManager.isVisible(AccountConstants.SAVE_BUTTON_XPATH);
        Assert.assertTrue(buttonIsVisible);
    }
    public static void verifyForms() {
        Assert.assertTrue(ActionManager.waitPresence(AccountConstants.LOGIN_FORM_XPATH).isDisplayed());
        Assert.assertTrue(ActionManager.waitPresence(AccountConstants.REGISTER_FORM_XPATH).isDisplayed());
    }
}
