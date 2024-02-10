package base

import org.openqa.selenium.NoSuchSessionException
import org.openqa.selenium.WebDriver

abstract class BaseWebDriver {
    protected WebDriver webDriver

    protected abstract void createWebDriver()

    def closeWebDriver() {
        if (webDriver == null)
            return
        try {
            webDriver.quit()
            webDriver = null
        } catch (NoSuchSessionException e) {
            e.printStackTrace()
        }
    }

    WebDriver getWebDriver() {
        if (webDriver == null) {
            createWebDriver()
        }
        return webDriver
    }
}

