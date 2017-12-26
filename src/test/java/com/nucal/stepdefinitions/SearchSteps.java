package com.nucal.stepdefinitions;

import com.nucal.base.BaseDriver;
import com.nucal.components.search.SearchComponent;
import cucumber.api.java8.En;
import org.junit.Assert;

public class SearchSteps extends BaseDriver implements En {

    BaseDriver base;
    SearchComponent search;

    public SearchSteps(BaseDriver base) {
        super();
        this.base = base;

        Given("^I am on \"([^\"]*)\"$", (String url) -> {
            System.out.println("This is the -I am on ...- step");
            Assert.assertEquals(url, base.getDriver().getCurrentUrl());
        });

        When("^I click search for \"([^\"]*)\"$", (String query) -> {
            System.out.println("This is the -I click search for...- step");
            search = new SearchComponent(base.getDriver());
            search.enterTextSearchBar(query);
        });

        Then("^I should see relevant search results$", () -> {
            System.out.println("This is the -I should see relevant results- step");
        });
        When("^I should see systemout for \"([^\"]*)\" and \"([^\"]*)\"$", (String arg0, String arg1) -> {
            System.out.println("first output: " + arg0 + " second output: " + arg1);
        });
        Given("^I want to write \"([^\"]*)\"$", (String txtToWrite) -> {
            System.out.println("sunu yaz: " + txtToWrite);
        });
        When("^I whatever$", () -> {
            System.out.println("whatever");
        });
        Then("^whatever II$", () -> {
            System.out.println("whatever II");
        });


    }
}
