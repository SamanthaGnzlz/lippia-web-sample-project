package lippia.web.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class DriverExceptionListener extends AbstractWebDriverEventListener {
    private final AdRemover adRemover;
    private boolean isRunning = false;

    public DriverExceptionListener(){
        adRemover = new AdRemover();
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver){
        if (isRunning) {
            return;
        }
        isRunning = true;
        adRemover.removeAd(driver);
        isRunning = false;
    }
}
