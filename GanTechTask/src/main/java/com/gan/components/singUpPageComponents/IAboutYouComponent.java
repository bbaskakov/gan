package com.gan.components.singUpPageComponents;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public interface IAboutYouComponent {

    SelenideElement titleDropDown = $x("//select[@id='title']");

    SelenideElement firstNameField = $x("//input[@id='forename']");

    SelenideElement lastNameField = $x("//input[@name='map(lastName)']");

    SelenideElement termsAndConditionCheckBox = $x("//input[@name='map(terms)']");

    SelenideElement joinNowButton = $x("//input[@id='form']");

    SelenideElement dateOfBirthErrorMessage = $x("//label[@for='dob']");

    default IAboutYouComponent selectTitle(String titleValue) {
        titleDropDown.shouldBe(Condition.visible).click();
        titleDropDown.selectOption(titleValue);
        return this;
    }

    default IAboutYouComponent setFirstName(String firstName) {
        firstNameField.shouldBe(Condition.visible).setValue(firstName);
        return this;
    }

    default IAboutYouComponent setLastName(String lastName) {
        lastNameField.shouldBe(Condition.visible).setValue(lastName);
        return this;
    }

    default IAboutYouComponent clickTermsAndConditionCheckBox() {
        termsAndConditionCheckBox.shouldBe(Condition.visible).click();
        return this;
    }

    default void clickJoinNowButton() {
        joinNowButton.shouldBe(Condition.visible).click();
    }

    default String getDateOfBirthErrorMessage() {
        return dateOfBirthErrorMessage.shouldBe(Condition.visible).getText();
    }
}
