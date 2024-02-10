package traits

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

trait LoginTrait {
    @FindBy(xpath="//button[@type=\\\"submit\\\" and contains(text(),'Sign In')]")
    WebElement loginButton

    @FindBy(xpath="//span[contains(text(),'Sign in with')]/parent::div/form/div/input[@type='email']")
    WebElement emailAddress

    @FindBy(xpath="//span[contains(text(),'Sign in with')]/parent::div/form/div/input[@type='password']")
    WebElement password
}