package com.gan.components.mainPageComponents;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public interface IHeaderComponent {
    SelenideElement headerLabel = $x("//img[@title='MoneyGaming']");
    SelenideElement joinNowButton = $x("//a[@href='/sign-up.shtml']");

    default boolean isHeaderDisplayed() {
        return headerLabel.shouldBe(Condition.visible).isDisplayed();
    }

    default void clickJoinNowButton() {
        joinNowButton.shouldBe(Condition.visible).click();
    }
}
