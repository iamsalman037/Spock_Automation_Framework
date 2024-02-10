package pages

import base.BasePage
import org.openqa.selenium.WebDriver
import traits.HomeTrait

class HomePage extends BasePage implements HomeTrait{

    HomePage(WebDriver webDriver) {
        super(webDriver)
    }

    def clicksignIn(){
       action.clickWebElement(signInButton, wait)
    }
}
