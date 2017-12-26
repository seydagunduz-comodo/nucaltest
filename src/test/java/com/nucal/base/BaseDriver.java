package com.nucal.base;

import org.openqa.selenium.WebDriver;

/**
 * This is the base driver, it is shared among with picocontainer as a DI solution
 */

public class BaseDriver {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver){
        this.driver = driver;
    }

}
