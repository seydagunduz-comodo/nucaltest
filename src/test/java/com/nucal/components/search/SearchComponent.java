package com.nucal.components.search;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchComponent {

    @FindBy(id = "lst-ib") // Page Factory
    private WebElement searchBar;

    public SearchComponent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void enterTextSearchBar(String text){
        searchBar.click();
        searchBar.sendKeys(text);
        searchBar.sendKeys(Keys.ENTER);
    }

}
