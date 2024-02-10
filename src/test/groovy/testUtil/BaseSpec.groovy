package testUtil

import base.BaseWebDriver
import driverfactory.DriverFactory
import driverfactory.WebDriverType
import groovy.json.JsonSlurper
import groovy.util.logging.Slf4j
import org.openqa.selenium.WebDriver
import spock.lang.Shared
import spock.lang.Specification

@Slf4j
abstract class BaseSpec extends Specification{
    @Shared
    protected static BaseWebDriver driverManager
    protected static WebDriver webDriver
    protected static def config
    protected static def url
    protected static def testData
    protected static def browserType


    def setupSpec(){
        String dataJson = "testData.json"
        log.info("----Running tests----")
        config = new ConfigSlurper().parse(new File("src/test/resources/Config.groovy").toURI().toURL())
        testData = new JsonSlurper().parse(this.getClass().getClassLoader().getSystemResourceAsStream(dataJson))
        Properties prop = new Properties()
        prop.load(this.getClass().getResourceAsStream('/browser.properties'))
        browserType = prop.getProperty('browser') != 'chrome'? WebDriverType.FIREFOX : WebDriverType.CHROME
        driverManager = DriverFactory.getDriverManager(browserType)
    }

    def setupBrowser(){
        webDriver =  driverManager.getWebDriver()
        config = new ConfigSlurper().parse(new File("src/test/resources/Config.groovy").toURI().toURL())
        url = config.siteUrl
    }

    def cleanupSpec(){
        if(driverManager != null){
            driverManager.closeWebDriver()
        }
    }
}
