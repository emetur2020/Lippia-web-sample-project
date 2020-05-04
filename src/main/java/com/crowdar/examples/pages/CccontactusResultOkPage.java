package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CccontactusResultOkPage extends PageBaseCccontactus {

    private WebElement statssuccess() {
        return getWebElement(By.cssSelector(".alert.alert-success.alert-dismissible"));//Verify Message: Thank you! Your message have been sent

    }

    public CccontactusResultOkPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "https://citycurator.co.uk/contact-us"; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public String getStatsok() {
        return statssuccess().getText();
    }


}
