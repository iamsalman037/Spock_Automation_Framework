package tests

import pages.HomePage
import pages.LoginPage
import spock.lang.Unroll
import testUtil.BaseSpec

@Unroll
class LoginTest extends BaseSpec{
    private static HomePage homePage
    private static LoginPage loginPage

    def setupSpec(){
        setupBrowser()
        homePage = new HomePage(webDriver)
        loginPage = new LoginPage(webDriver)
    }

    def "Login with the credentials"(){
        given: 'Launch the Application'
        def appUrl = url
        webDriver.get(appUrl)

        when: 'Click on Sign in button'
        homePage.clicksignIn()

        then: 'Verify the Login Page is displayed'
        loginPage.isDisplayed(loginPage.loginButton)
    }
}
