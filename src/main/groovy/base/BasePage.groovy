package base

import actions.UiActionsImpl
import actions.UiGetActionsImpl
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.WebDriverWait

abstract class BasePage {
    protected WebDriver webDriver
    protected WebDriverWait wait, shortWait, longWait
    protected BaseAction action
    protected BaseAction get
    private final int TIMEOUT_ELEMENTPRESENT = 30
    private final int TIMEOUT_SHORTWAIT = 30
    private final int TIMEOUT_LONG = 60

    BasePage(WebDriver webDriver){
        this.webDriver = webDriver
        this.wait = new WebDriverWait(this.webDriver, TIMEOUT_ELEMENTPRESENT)
        shortWait = new WebDriverWait(this.webDriver, TIMEOUT_SHORTWAIT)
        longWait = new WebDriverWait(this.webDriver, TIMEOUT_LONG)
        PageFactory.initElements(this.webDriver, this)
        action = new UiActionsImpl()
        get = new UiGetActionsImpl()
    }

    def isDisplayed(WebElement element){
        boolean isPresent = false
        try{
            element.isDisplayed()
            isPresent = true
        }
        catch(Exception e){
            print "Element not displayed"
        }
        return isPresent
    }
}
