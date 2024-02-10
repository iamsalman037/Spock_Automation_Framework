package driverfactory

import base.BaseWebDriver
import driverfactory.webdrivers.ChromeWebDriver

class DriverFactory {
    static BaseWebDriver getDriverManager(WebDriverType driverType){
        BaseWebDriver driverManager = null

        switch(driverType){
            case WebDriverType.CHROME:
                driverManager = new ChromeWebDriver()
                break
        }
        return driverManager
    }
}
