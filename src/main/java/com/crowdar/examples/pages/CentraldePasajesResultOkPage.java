package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CentraldePasajesResultOkPage extends PageBaseCentraldePasajes {
    //SCENARIO 01
    private WebElement statConsultaVerification() {
        return getWebElement(By.xpath("//div[@id='olark-container']/div/div"));//Verify Message: Su consulta ha sido enviada con exito.
    }

    //SCENARIO 02
    private WebElement statOpinionVerification() {
        return getWebElement(By.cssSelector("div.fbtn-m"));//Verify Message: Muchas gracias. Su opinión es muy importante, le agradecemos su tiempo.
    //*[@id="fby-form"]/tbody
    }

    //SCENARIO 03
    private WebElement statLowcostVerification() {
        return getWebElement(By.cssSelector("#Alertbar1_labelAlerta"));//Verify Message: Muchas gracias. Su opinión es muy importante, le agradecemos su tiempo.
     // #Alertbar1_labelAlerta
    }
    //SCENARIO 04

    private WebElement statEnvioVacioVerification() {
        return getWebElement(By.xpath("//span[@id='lblMensaje']"));//Verify Message: Completá los datos y hacé click en el botón Buscar para acceder al pasaje y reenviarlo a tu casilla de correo o a la de otro pasajero.
    }

    // SCENARIO 05

    private WebElement statFAQVerification() {
        return getWebElement(By.xpath("//div[2]/div/div"));//Verify Message: ¿Puedo comprar pasajes de ida y vuelta en una misma operación?
    }

    //SCENARIO 06

    private WebElement statPromoVerification() {
        return getWebElement(By.xpath("/html/body/div[2]/section/h2"));//Verify Message: Cuotas sin interés
    }

    //SCENARIO 07

    private WebElement statDevolucionVerification() {
        return getWebElement(By.xpath("//*[@id=\"form1\"]/h3"));//Verify Message: En este momento la devolución online no se encuentra disponible
    }

    //SCENARIO 08

    private WebElement statsNewslettersuccess() {
        return getWebElement(By.xpath("/html/body/section[4]/div/div[2]/div/h5[2]"));//Verify Message: ¡Gracias por suscribirse a nuestro newsletter!

    }

    //SCENARIO 09
    private WebElement statssuccess() {
        return getWebElement(By.xpath("//div[@id='alertDialog']/div"));//Verify Message: No se encontraron servicios en la fecha seleccionada, por favor, intentá nuevamente modificando las fechas o los destinos.

    }

    //SCENARIO 10
    private WebElement statBasesVerification() {
        return getWebElement(By.xpath("//*[@id=\"Heading1\"]"));//Verify Message: Bases y Condiciones.

    }

    public CentraldePasajesResultOkPage(RemoteWebDriver driver) {
        super(driver);
        this.url = "https://www.centraldepasajes.com.ar/"; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }
    //SCENARIO 01

        public String getConsultaStatsok() {
            return statConsultaVerification().getText();
        }

    //SCENARIO 02

    public String getOpinionStatsok() {
        return statOpinionVerification().getText();
    }

    //SCENARIO 03

    public String getLowcostStatsok() {
        return statLowcostVerification().getText();
    }

    //SCENARIO 04

    public String getEnvioVacioStatsok() {
       return statEnvioVacioVerification().getText();
    }


    //SCENARIO 05

    public String getFAQStatsok() {
        return statFAQVerification().getText();
    }

    //SCENARIO 06

    public String getPromoStatsok() { return statPromoVerification().getText();   }

    //SCENARIO 07

    public String getDevolucionStatsok() { return statDevolucionVerification().getText();   }

    //SCENARIO 08

    public String getNewsletterStatsok() {
        return statsNewslettersuccess().getText();
    }

    //SCENARIO 09

    public String getStatsok() {
        return statssuccess().getText();
    }

    //SCENARIO 10

    public String getBasesStatsok() {
        return statBasesVerification().getText();
    }

}
