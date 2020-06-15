package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class phptravelsbookingResultOkPage extends PageBasephptravelsbooking {
    private WebElement Verificacion() {
        return getWebElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/div/div[2]/span"));//Verify Message: No se puede completar la acción. Compruebe su conexión e inténtelo de nuevo.
    }


    public phptravelsbookingResultOkPage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }
        public String getStatsReservaok() {
            return Verificacion().getText();
        }

}
