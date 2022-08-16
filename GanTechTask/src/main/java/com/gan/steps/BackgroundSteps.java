package com.gan.steps;

import com.codeborne.selenide.Configuration;
import com.gan.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.open;

public class BackgroundSteps {
    private final MainPage mainPage = new MainPage();

    @Given("User navigate to the Main page - {string}")
    public void userNavigateToTheMainPage(String pageUrl) {
        Configuration.browserSize = "1280x800";
        Configuration.pageLoadTimeout = 180000L;
        open(pageUrl);
    }

    @Then("^User should see the Main page$")
    public void userShouldSeeTheMainPage() {
        mainPage.isHeaderDisplayed();
    }
}
