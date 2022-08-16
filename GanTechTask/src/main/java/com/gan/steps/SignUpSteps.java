package com.gan.steps;

import com.gan.pages.MainPage;
import com.gan.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignUpSteps {
    private final MainPage mainPage = new MainPage();
    private final SignUpPage signUpPage = new SignUpPage();

    @Given("^As a new moneygaming\\.com player$")
    public void asANewMoneygamingComPlayer() {
        mainPage.clickJoinNowButton();
    }

    @When("I want to be able to register using my minimum details,title - {string}, user name - {string}, last name -{string}")
    public void iWantToBeAbleToRegisterUsingMyFullDetails(String title, String userName, String lastName) {
        signUpPage
                .selectTitle(title)
                .setFirstName(userName)
                .setLastName(lastName)
                .clickTermsAndConditionCheckBox()
                .clickJoinNowButton();
    }

    @Then("So that I can see validation error message under birth date field - {string}")
    public void soThatICanPlayOnlineCasinoGames(String errorMessage) {
        Assert.assertEquals(signUpPage.getDateOfBirthErrorMessage(), errorMessage,
                "The error message is not displayed or not equals to " + errorMessage);
    }

}
