package driverfactory.webdrivers

import base.BaseWebDriver
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

class ChromeWebDriver extends BaseWebDriver {

    protected void createWebDriver() {
        Properties prop = new Properties()
        prop.load(this.getClass().getResourceAsStream('/browser.properties'))
        WebDriverManager.chromedriver().setup()
        ChromeOptions options = new ChromeOptions()
        options.addArguments("--test-type")
        options.addArguments("incognito")
        if (prop.getProperty('headless').toBoolean()) {
            options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors", "--no-sandbox", "--disable-dev-shm-usage")
        }
        webDriver = new ChromeDriver(options)
    }
}
