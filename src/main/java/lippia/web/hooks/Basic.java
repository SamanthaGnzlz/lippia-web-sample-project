package lippia.web.hooks;

import io.cucumber.java.Before;
import com.crowdar.driver.DriverManager;
import lippia.web.listeners.DriverExceptionListener;

public class Basic {
    @Before
    public void beforeScenario() {
        DriverManager.getDriverInstance().register(new DriverExceptionListener());
    }
}
