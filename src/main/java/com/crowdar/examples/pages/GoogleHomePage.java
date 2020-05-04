package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleHomePage extends PageBaseGoogle {

    private final String INPUT_SEARCH_XPATH = "//input[@class='gLFyf gsfi']";
    private final String SEARCH_BUTTON_NAME = ("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b");

    public GoogleHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void enterSearchCriteria(String text) {
        completeField(By.xpath(INPUT_SEARCH_XPATH), text);
    }

    public void clickSearchButton() {
        clickElement(By.cssSelector(SEARCH_BUTTON_NAME));
    }

}
