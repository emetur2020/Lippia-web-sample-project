package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LatinoBridgeResultOkPage extends PageBaseLatinoBridge {
    //SCENARIO 01
    private WebElement statCotizacionVerification() {
        return getWebElement(By.xpath("//h3"));//Verifica Mensaje: Gracias. Un miembro de nuestro equipo lo contactará a la brevedad
    }


    public LatinoBridgeResultOkPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "https://latinobridge.com/"; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }
    //SCENARIO 01

        public String getCotizacionStatsok() {
            return statCotizacionVerification().getText();
        }



}
