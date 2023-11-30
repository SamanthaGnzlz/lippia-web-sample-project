package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.BillingFormConstants;
import lippia.web.constants.ShopConstants;
import com.crowdar.core.actions.WebActionManager;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ShopService {
    public static void clickAddtoBasket() {
        ActionManager.waitVisibility(ShopConstants.ADD_TO_BASKET_XPATH);
        ActionManager.click(ShopConstants.ADD_TO_BASKET_XPATH);
    }
    public static void enterCountry(String country) {
        ActionManager.setInput(BillingFormConstants.COUNTRY_ID, country);
        ActionManager.click(BillingFormConstants.COUNTRY_CONFIRM_ID);
        BaseService.getMyWait();
    }
    public static void checkTaxPercentage(Double percentage) {
        BaseService.scroll(ShopConstants.TAX);
        BaseService.getMyWait();
        double subtotal = getSubtotal();
        double tax = getTax();
        double taxRate = (tax/subtotal)*100;

        Assert.assertEquals(taxRate,percentage, "El porcentaje de impuestos no coincide");
    }
    private static double getSubtotal(){
        WebElement subtotal = WebActionManager.getElement(ShopConstants.SUBTOTAl);
        return Double.parseDouble(subtotal.getText().substring(1));
    }
    private static double getTax(){
        WebElement total = WebActionManager.getElement(ShopConstants.TAX);
        return Double.parseDouble(total.getText().substring(1));
    }
}
