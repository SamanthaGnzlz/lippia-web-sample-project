package lippia.web.services;

import com.crowdar.core.LocatorManager;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.BillingFormConstants;
import lippia.web.constants.HomePageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import javax.swing.*;
import java.util.List;

public class HomePageService {
    public static void navigateWeb() {
        WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickShopButton() {
        ActionManager.waitClickable(HomePageConstants.SHOP_BUTTON_XPATH);
        ActionManager.click(HomePageConstants.SHOP_BUTTON_XPATH);
    }
    public static void clickOnImage() {
        ActionManager.waitPresence(HomePageConstants.ARRIVALS_IMAGE_XPATH);
        WebActionManager.click(HomePageConstants.ARRIVALS_IMAGE_XPATH, true);
    }
    public static void clickAddToBasketButton() {
        ActionManager.click(HomePageConstants.ADD_TO_BASKET_BUTTON_XPATH);
    }
    public static void clickItemButton() {
        By locator = LocatorManager.getLocator(HomePageConstants.ITEM_BUTTON_XPATH);
        ActionManager.getFluentWait().until(ExpectedConditions.textToBePresentInElementLocated(locator, "1 Item"));
        ActionManager.click(HomePageConstants.ITEM_BUTTON_XPATH);
    }
    public static void checkValues() {
        ActionManager.waitVisibility(HomePageConstants.SUBTOTAL_XPATH, HomePageConstants.TOTAL_XPATH);
        Assert.assertTrue(ActionManager.waitPresence(HomePageConstants.SUBTOTAL_XPATH).isDisplayed());
        Assert.assertTrue(ActionManager.waitPresence(HomePageConstants.TOTAL_XPATH).isDisplayed());
    }
    public static void checkApplyCouponButton() {
        Assert.assertTrue(ActionManager.waitPresence(HomePageConstants.APPLY_COUPON_BUTTON_XPATH).isDisplayed());
    }
    public static void clickCheckoutButton() {
        WebActionManager.click(HomePageConstants.PROCEED_TO_CHECKOUT_BUTTON_XPATH);
    }
    public static void fillBillingForm() {
        ActionManager.setInput(BillingFormConstants.FIRST_NAME_ID, BillingFormConstants.FIRST_NAME);
        ActionManager.setInput(BillingFormConstants.LAST_NAME_ID, BillingFormConstants.LAST_NAME);
        ActionManager.setInput(BillingFormConstants.EMAIL_ID, BillingFormConstants.EMAIL);
        ActionManager.setInput(BillingFormConstants.PHONE_ID, BillingFormConstants.PHONE);
        ActionManager.setInput(BillingFormConstants.COUNTRY_ID, BillingFormConstants.COUNTRY);
        ActionManager.click(BillingFormConstants.COUNTRY_CONFIRM_ID);
        ActionManager.setInput(BillingFormConstants.ADDRESS_ID, BillingFormConstants.ADDRESS);
        ActionManager.setInput(BillingFormConstants.CITY_ID, BillingFormConstants.CITY);
        ActionManager.click(BillingFormConstants.STATE_XPATH);
        ActionManager.click(BillingFormConstants.STATE_CONFIRM_ID);
        ActionManager.setInput(BillingFormConstants.ZIP_ID, BillingFormConstants.ZIP);
    }
    public static void choosePayment() {
        ActionManager.click(HomePageConstants.CHECK_PAYMENT_XPATH);
    }
    public static void clickPlaceOrderButton() {
        ActionManager.click(HomePageConstants.PLACE_ORDER_BUTTON_ID);
    }
    public static void checkDetails() {
        Assert.assertTrue(ActionManager.waitPresence(HomePageConstants.ORDER_DETAILS_XPATH).isDisplayed());
    }
}
