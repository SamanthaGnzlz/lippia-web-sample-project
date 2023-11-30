package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class BaseService extends ActionManager {
    public static void getMyWait(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void scroll(String locator) {
        WebElement element = waitVisibility(locator);
       // JavascriptExecutor jse = DriverManager.getDriverInstance();
       // jse.executeScript("arguments[0].scrollIntoView()", element);
        new Actions(DriverManager.getDriverInstance()).moveToElement(element).perform();
    }
}
