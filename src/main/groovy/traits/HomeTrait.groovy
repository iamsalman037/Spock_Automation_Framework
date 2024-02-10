package traits

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

trait HomeTrait {
    @FindBy(xpath="//a[@href='/auth']")
    WebElement signInButton
}