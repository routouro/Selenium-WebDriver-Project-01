package qa.util.base;

import org.openqa.selenium.WebDriver;

public abstract class DriverContainer {

    protected static WebDriver driver() {
        return BaseTest.driver();
    }
}
