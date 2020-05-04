package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CccontactusHomePage extends PageBaseCccontactus {

    private final String INPUT_NAME_CSSLOCATOR = ".name-input";
    private final String INPUT_LASTNAME_CSSLOCATOR = ".lastname-input";
    private final String INPUT_EMAILADDRESS_CSSLOCATOR = ".email-input";
    private final String INPUT_MESSAGE_CSSLOCATOR = ".ng-untouched:nth-child(2)";
    private final String SUBMIT_BUTTON_NAME = ".btn-outline-primary";

    public CccontactusHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "https://citycurator.co.uk/contact-us"; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void name(String name) { completeField(By.cssSelector(INPUT_NAME_CSSLOCATOR), name); }

    public void lastname(String lastname) { completeField(By.cssSelector(INPUT_LASTNAME_CSSLOCATOR), lastname); }

    public void emailaddress(String emailaddress) { completeField(By.cssSelector(INPUT_EMAILADDRESS_CSSLOCATOR), emailaddress); }

    public void message(String message) { completeField(By.cssSelector(INPUT_MESSAGE_CSSLOCATOR), message); }

    public void clickSubmitButton() {
        clickElement(By.cssSelector(SUBMIT_BUTTON_NAME));
    }

}
