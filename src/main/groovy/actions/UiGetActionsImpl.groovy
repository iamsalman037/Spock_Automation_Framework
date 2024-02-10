package actions

import base.BaseAction
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedCondition
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

class UiGetActionsImpl implements BaseAction{
    def clickWebElement(WebElement element, WebDriverWait wait) {}

    String elementText(WebElement element, ExpectedCondition condition, WebDriverWait wait){
        wait.until(condition)
        return element.getText()
    }

    String elementText(WebElement element, WebDriverWait wait) {
        elementText(element, ExpectedConditions.visibilityOf(element), wait)
    }
}
