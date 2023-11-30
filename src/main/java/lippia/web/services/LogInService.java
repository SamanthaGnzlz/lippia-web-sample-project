package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.AccountConstants;
import lippia.web.constants.LogInConstants;
import org.testng.Assert;

public class LogInService {
    public static void clickAccountButton() {
        ActionManager.click(AccountConstants.ACCOUNT_BUTTON_XPATH);
    }
    public static void setUser(String username) {
        ActionManager.setInput(LogInConstants.USER_INPUT_ID, username);
    }
    public static void setPassword(String password) {
        ActionManager.setInput(LogInConstants.PASSWORD_INPUT_ID, password);
    }
    public static void clickLogInButton() {
        ActionManager.click(LogInConstants.LOGIN_BUTTON_XPATH);
    }
    public static void verifyPrompt(String prompt) {
        String text = ActionManager.getElement(LogInConstants.ERROR_TEXT_XPATH).getText();
        boolean contains = text.contains(prompt);
        Assert.assertTrue(contains);
    }
    public static void clickLogOutItem() {
        ActionManager.click(LogInConstants.LOGOUT_ITEM_XPATH);
    }
    public static void clickBackButton() {
        DriverManager.getDriverInstance().navigate().back();
    }
    public static void verifyLogOut() {
        Assert.assertFalse(ActionManager.isPresent(LogInConstants.LOGOUT_ITEM_XPATH));
    }
}
