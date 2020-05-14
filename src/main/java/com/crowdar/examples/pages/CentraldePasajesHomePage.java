package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CentraldePasajesHomePage extends PageBaseCentraldePasajes {

    private final String CLICK_ORIGEN_XPATH = "//span[@id='select2-PadOrigen-container']";
    private final String INPUT_ORIGEN_XPATH = "//input[@type='search']";
    private final String CLICK_ORIGENOK_XPATH = "//*[@id=\"select2-PadOrigen-results\"]/li[1]";
    private final String INPUT_DESTINO_XPATH = "//input[@type='search']";
    private final String CLICK_DESTINOOK_XPATH = "//*[@id=\"select2-PadDestino-results\"]/li[1]";
    private final String SUBMIT_OKCALENDARIO_XPATH = "//*[@id=\"fechaPartida\"]";
    private final String SUBMIT_CALENDARIO_XPATH = "//div[@id='cdp-calendar-container']/div/div[2]/table/tbody/tr[4]/td[5]/div";
    private final String SEARCH_BUTTON_NAME = "btnCons";

    public CentraldePasajesHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "https://www.centraldepasajes.com.ar/"; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    public void clickorigen() { clickElement(By.xpath(CLICK_ORIGEN_XPATH));  }

    public void origen(String origen) { completeField(By.xpath(INPUT_ORIGEN_XPATH), origen); }

    public void clickorigenok() { clickElement(By.xpath(CLICK_ORIGENOK_XPATH));  }

    public void destino(String destino) { completeField(By.xpath(INPUT_DESTINO_XPATH), destino); }

    public void clickdestinook() { clickElement(By.xpath(CLICK_DESTINOOK_XPATH));  }

    public void okcalendario() { clickElement(By.xpath(SUBMIT_OKCALENDARIO_XPATH));  }

    public void calendario() { clickElement(By.xpath(SUBMIT_CALENDARIO_XPATH)); }

    public void buscar() { clickElement(By.name(SEARCH_BUTTON_NAME));   }


    }
