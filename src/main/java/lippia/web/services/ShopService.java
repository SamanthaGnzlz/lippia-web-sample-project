package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.ShopConstants;
import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ShopService {
    //region home page feature
    public static void navigateWeb() {
        WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickShopButton() {
        ActionManager.click(ShopConstants.SHOP_BUTTON_XPATH);
    }

    public static void clickHomeButton() {
        ActionManager.click(ShopConstants.HOME_BUTTON_XPATH);
    }

    public static void checkThreeArrivals() {
        List<WebElement> arrivals = ActionManager.getElements(ShopConstants.ARRIVALS_XPATH);
        Assert.assertEquals(arrivals.size(), 3);
    }

    public static void clickOnImage() {
        WebActionManager.click(ShopConstants.ARRIVALS_IMAGE_XPATH, true);
    }

    public static void checkBasketButton() {
        boolean buttonIsVisible = ActionManager.isVisible(ShopConstants.BASKET_BUTTON_XPATH);
        Assert.assertTrue(buttonIsVisible);
    }

    public static void clickReviewButton() {
        ActionManager.click(ShopConstants.REVIEW_BUTTON_XPATH);
    }

    public static void checkReviews() {
        boolean reviewsAreVisible = ActionManager.isVisible(ShopConstants.REVIEWS_XPATH);
        Assert.assertTrue(reviewsAreVisible);
    }
    //endregion

    //region shop feature
    public static void clickOnSale() {
        ActionManager.click(ShopConstants.SALE_TAG_XPATH);
    }

    private static int getPriceChildren() {
        WebElement priceElement = ActionManager.getElement(ShopConstants.PRICE_XPATH);
        List<WebElement> children = priceElement.findElements(By.xpath("*"));
        return children.size();
    }

    public static void checkPrices() {
        int childrenSize = ShopService.getPriceChildren();
        Assert.assertEquals(childrenSize, 2);
    }

    public static void clickOnCategory() {
        ActionManager.click(ShopConstants.CATEGORY_LINK_XPATH);
    }

    public static void checkHTMLURL() {
        WebDriver driver = DriverManager.getDriverInstance();
        boolean urlIsPresent = driver.getCurrentUrl().contains("html");
        Assert.assertTrue(urlIsPresent);
    }

    public static void clickDropdown(String option) {
        WebActionManager.setDropdownByText(ShopConstants.DROPDOWN_XPATH, option);
    }

    public static void checkFilterURL(String filter) {
        WebDriver driver = DriverManager.getDriverInstance();

        String order;
        if (filter.equals("low to high")) {
            order = "price";
        } else {
            order = "price-desc";
        }

        boolean urlIsPresent = driver.getCurrentUrl().contains(order);
        Assert.assertTrue(urlIsPresent);
    }
    //endregion

    //region login feature
    public static void clickAccountButton() {
        ActionManager.click(ShopConstants.ACCOUNT_BUTTON_XPATH);
    }

    public static void setUser(String username) {
        ActionManager.setInput(ShopConstants.USER_INPUT_ID, username);
    }

    public static void setPassword(String password) {
        ActionManager.setInput(ShopConstants.PASSWORD_INPUT_ID, password);
    }

    public static void clickLogInButton() {
        ActionManager.click(ShopConstants.LOGIN_BUTTON_XPATH);
    }

    public static void checkLogIn() {
        WebDriver driver = DriverManager.getDriverInstance();
        boolean urlIsPresent = driver.getCurrentUrl().contains("my-account");
        Assert.assertTrue(urlIsPresent);
    }

    public static void verifyPrompt(String prompt) {
        String text = ActionManager.getElement(ShopConstants.ERROR_TEXT_XPATH).getText();
        boolean contains = text.contains(prompt);
        Assert.assertTrue(contains);
    }

    public static void checkPasswordType() {
        WebElement password = ActionManager.getElement(ShopConstants.PASSWORD_INPUT_ID);
        boolean typeIsPassword = password.getAttribute("type").equals("password");
        Assert.assertTrue(typeIsPassword);
    }
    //endregion

    //region my account feature

    public static void clickDashboard() {
        ActionManager.click(ShopConstants.DASHBOARD_XPATH);
    }

    public static void checkDashboard() {
        String text = ActionManager.getElement(ShopConstants.DASHBOARD_TEXT_XPATH).getText();
        boolean contains = text.contains(ShopConstants.TEXT_DASHBOARD);
        Assert.assertTrue(contains);
    }

    public static void clickAccountDetails() {
        ActionManager.click(ShopConstants.ACCOUNTDETAILS_XPATH);
    }

    public static void checkSaveButton() {
        boolean buttonIsVisible = ActionManager.isVisible(ShopConstants.SAVE_BUTTON_XPATH);
        Assert.assertTrue(buttonIsVisible);
    }

    public static void clickAdresses() {
        ActionManager.click(ShopConstants.ADRESSES_XPATH);
    }

    public static void checkAddresses() {
        String texto = ActionManager.getElement(ShopConstants.ADRESSES_TEXT_XPATH).getText();
        boolean contains = texto.contains(ShopConstants.TEXT_ADDRESSES);
        Assert.assertTrue(contains);
    }
    //endregion
}
