package actions

import base.BaseAction
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

class UiActionsImpl implements BaseAction{

    def clickWebElement(WebElement element, WebDriverWait wait) {
        clickWebElement(element, ExpectedConditions.visibilityOf(element), wait)
    }

    String elementText(WebElement element, WebDriverWait wait) {}
}
