package lippia.web.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.crowdar.core.actions.ActionManager.getElement;

public class AdRemover {
    private final String AD_BUTTON_ID = "id:dismiss-button";
    private final String IFRAME2_ID = "id:ad_iframe";
    private final String IFRAME1_XPATH = "xpath:/html/ins/*/iframe[contains(@id, 'aswift_')]";

    public void removeAd(WebDriver driver) {
        boolean isAdPresent = driver.getCurrentUrl().contains("#google_vignette");
        if (isAdPresent) {
            tryToRemoveAd(IFRAME1_XPATH, driver);
            tryToRemoveAd(IFRAME2_ID, driver);
            driver.switchTo().defaultContent();
        }
    }

    private void tryToRemoveAd(String iframeXpath, WebDriver driver) {
        try {
            WebElement iframe = getElement(iframeXpath);
            driver.switchTo().frame(iframe);
            WebElement closeButton = getElement(AD_BUTTON_ID);
            closeButton.click();
        }
        catch(Exception ignored) {
            return;
        }
    }
}

