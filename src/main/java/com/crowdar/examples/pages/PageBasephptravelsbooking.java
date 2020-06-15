package com.crowdar.examples.pages;

import com.crowdar.core.pageObjects.PageBaseWeb;
import org.openqa.selenium.remote.RemoteWebDriver;

public class PageBasephptravelsbooking extends PageBaseWeb {

    public PageBasephptravelsbooking(RemoteWebDriver driver) {
        super(driver);
        BASE_URL = "http://phptravels.net/home";
    }


}
