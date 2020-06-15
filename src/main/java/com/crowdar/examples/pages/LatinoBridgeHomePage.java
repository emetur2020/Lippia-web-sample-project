package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LatinoBridgeHomePage extends PageBaseLatinoBridge {

    //PAGE OBJECTS SCENARIO 01
    private final String INPUT_USUARIO_ID = "name";
    private final String INPUT_MAILCOTIZACION_ID = ("email");
    private final String INPUT_TELEFONO_ID = "phone";
    private final String INPUT_MENSAJECOTIZACION_ID = "message_details";
    private final String CLICK_MENSAJECOTIZACION_XPATH = ("//button[@type='submit']");




    public LatinoBridgeHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "https://latinobridge.com/camp/translation-services/spanish/?ac_source_id=38&mkt_campaign_id=291&gclid=Cj0KCQjw-_j1BRDkARIsAJcfmTEzNJNAA-WIH8KPY8e54Rjfc-sr136QAOiElwgDTrrt_IwMKYMKBFsaAqHuEALw_wcB"; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    //SCENARIO 01

    public void usuarioNombre(String usuarioNombre) { completeField(By.id(INPUT_USUARIO_ID), usuarioNombre);   }

    public void mailCotizacion(String mailCotizacion) { completeField(By.id(INPUT_MAILCOTIZACION_ID), mailCotizacion);   }

    public void telefonoCotizacion(String telefonoCotizacion) { completeField(By.id(INPUT_TELEFONO_ID), telefonoCotizacion);  }

    public void mensajeCotizacion(String mensajeCotizacion) { completeField(By.id(INPUT_MENSAJECOTIZACION_ID), mensajeCotizacion);  }

    public void clickmensajeCotizacionenvok() { clickElement(By.xpath(CLICK_MENSAJECOTIZACION_XPATH));   }



    }
