package base

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait

interface BaseAction {
    def clickWebElement(WebElement element, WebDriverWait wait)

    String elementText(WebElement element, WebDriverWait wait)
}