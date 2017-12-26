package com.nucal.base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Define all the hooks in this class
 * If "after" and "before" annotations run before all test cases(scenarios)
 * If any annotation uses some other annotation referance (as in "@After("@IamSomeRandomTag")")
 * then this annotation only works for tests or features having this annotation
 */


public class Hooks extends BaseDriver {

    BaseDriver baseDriver;

    public Hooks(BaseDriver baseDriver){
        this.baseDriver = baseDriver;
    }

    @Before
    public void initTests(){
        System.out.println("HOOK: i am a hook and I am initiating tests");
        System.setProperty("webdriver.gecko.driver","./src/drivers/geckodriver.exe");
        baseDriver.setDriver(new FirefoxDriver());
        baseDriver.getDriver().get("https://www.google.com.tr/");
    }

    @After
    public void teardownTests(Scenario scenario){
        if (!scenario.isFailed()){
            System.out.println("HOOK: Teardown hook: scenario passed");
        }
        if (scenario.isFailed()){
            //TODO: Log Sth in case of fail
            //TODO: Add screenshot in case of fail
            System.out.println("HOOK: ... Ooops failed! ");
        }
        baseDriver.getDriver().close();
    }

    @After("@IamSomeRandomTag")
    public void afterSomeTag(){
        System.out.println("HOOK: This is the line After @IamSomeRandomTag");
    }
}
