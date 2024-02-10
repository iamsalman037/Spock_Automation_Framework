package pages

import base.BasePage
import org.openqa.selenium.WebDriver
import traits.LoginTrait

class LoginPage extends BasePage implements LoginTrait{
    LoginPage(WebDriver webDriver) {
        super(webDriver)
    }

    def isLoginPageDisplayed(){

    }
}
