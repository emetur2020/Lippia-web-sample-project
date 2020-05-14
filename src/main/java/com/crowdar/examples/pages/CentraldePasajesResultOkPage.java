package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CentraldePasajesResultOkPage extends PageBaseCentraldePasajes {

    private WebElement statssuccess() {
        return getWebElement(By.xpath("//div[@id='alertDialog']/div"));//Verify Message: No se encontraron servicios en la fecha seleccionada, por favor, intentá nuevamente modificando las fechas o los destinos.

    }

    public CentraldePasajesResultOkPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "https://www.centraldepasajes.com.ar/"; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public String getStatsok() {
        return statssuccess().getText();
    }


}
