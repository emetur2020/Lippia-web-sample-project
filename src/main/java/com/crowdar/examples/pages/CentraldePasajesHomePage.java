package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CentraldePasajesHomePage extends PageBaseCentraldePasajes {

    //PAGE OBJECTS SCENARIO 01
    private final String CLICK_CONSULTA_XPATH = "//div[@id='olark-offline-form']/div[2]/form/div/label";
    private final String INPUT_USUARIO_ID = "olark-form-input-fname";
    private final String INPUT_MAILCONSULTA_ID = ("olark-form-input-email");
    private final String INPUT_TELEFONO_ID = "olark-form-input-phone";
    private final String CLICK_MENSAJECONSULTA_ID = ("olark-form-input-body");
    private final String INPUT_MENSAJECONSULTA_ID = "olark-form-input-body";
    private final String CLICK_MENSAJECONSULTA_XPATH = ("(//button[@type='submit'])[2]");


    //PAGE OBJECTS SCENARIO 02
    private final String CLICK_OPINION_XPATH = "//a[@onclick=\"fby.push(['showForm', '9261']);return false;\"]";
    private final String CLICK_PUNTAJE_LINKTEXT = "7";
    private final String CLICK_BARRIO_XPATH = ("//a[contains(text(),'Barrios')]");
    private final String CLICK_BARRACAS_XPATH = ("//*[@id=\"fby-form\"]/tbody/tr[4]/td[2]/div/div[2]/div[1]/div/div[1]/div[7]/div/div/div/div[2]/table/tbody/tr/td[1]/a[4]");
    private final String INPUT_MOTIVO_ID = "feedback-text";
    private final String CLICK_MOTIVO_CSSLOCATOR = ("div.fbtn-m");
    private final String CLICK_MAILOKOPINION_NAME = ("femail");
    private final String INPUT_MAILOPINION_XPATH = "//table[@id='fby-form']/tbody/tr[4]/td[2]/div/div[2]/div/div/div[2]/table/tbody/tr/td[2]/input";
    private final String CLICK_MAILOPINION_XPATH = ("//table[@id='fby-form']/tbody/tr[4]/td[2]/div/div[2]/div[2]/div/a/div[3]");

    //PAGE OBJECTS SCENARIO 03
    private final String CLICK_LOWCOST_XPATH = "(//img[@alt='Mar del Plata'])[2]";
    private final String CLICK_PRECIO_ID = "grillaservicios_ctl02_lblPrecio";
    private final String CLICK_BUTACA_XPATH = ("//*[@id=\"b1_05\"]");
    private final String CLICK_BUTACAOK_XPATH = ("//*[@id=\"btnSigue\"]/a");
    private final String CLICK_ENVFORM_ID = ("btnSigue");

    //PAGE OBJECTS SCENARIO 04

    private final String CLICK_REENVIARPASAJE_XPATH = "//a[@type='button']";
    private final String CLICK_BOTONREENVIAR_ID = ("btnBuscarReenviar");

    //PAGE OBJECTS SCENARIO 05

    private final String CLICK_AYUDA_XPATH = "/html/body/nav/div/div[2]/p/a/img";
    private final String INPUT_AYUDAFORM_ID = ("textBoxWordsSearch");
    private final String CLICK_BUSCAR_XPATH = "//a[contains(text(),'Buscar')]";
    private final String CLICK_LINK_XPATH = "//a/div/div";

    //PAGE OBJECTS SCENARIO 06

    private final String CLICK_PROMOINFO_XPATH = "(//a[contains(@href, '../promociones')])[2]";
    private final String CLICK_PROMOLINK_XPATH = ("//img[@alt='Cuotas sin interés en pasajes en micro']");


    //PAGE OBJECTS SCENARIO 07

    private final String CLICK_DEVOLVERPASAJE_XPATH = "/html/body/header/div[1]/div/ul/li[1]/a";

    //PAGE OBJECTS SCENARIO 08
    private final String INPUT_SEARCH_ID = "newsletterEmail";
    private final String CLICK_BUTTON_CLASSNAME = "btn btn-primary";

    //PAGE OBJECTS SCENARIO 09
    private final String CLICK_ORIGEN_ID = "select2-PadOrigen-container";
    private final String INPUT_ORIGEN_XPATH = "//input[@type='search']";
    private final String CLICK_ORIGENOK_XPATH = "//*[@id=\"select2-PadOrigen-results\"]/li[1]";
    private final String INPUT_DESTINO_XPATH = "//input[@type='search']";
    private final String CLICK_DESTINOOK_XPATH = "//*[@id=\"select2-PadDestino-results\"]/li[1]";
    private final String CLICK_CALENDARIO_ID = "fechaPartida";
    private final String CLICK_OKCALENDARIO_XPATH = "//*[@id=\"cdp-calendar-container\"]/div/div[2]/table/tbody/tr[5]/td[2]/div";
    private final String SEARCH_BUTTON_NAME = "btnCons";

    //PAGE OBJECTS SCENARIO 10

    private final String CLICK_BASESCONDICIONES_XPATH = "/html/body/footer/div/div[1]/div[2]/ul/li[5]/a";


    public CentraldePasajesHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = "https://www.centraldepasajes.com.ar/"; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }

    //SCENARIO 01

    public void dejanosConsulta() { clickElement(By.xpath(CLICK_CONSULTA_XPATH));   }

    public void usuarioConsulta(String usuarioConsulta) { completeField(By.id(INPUT_USUARIO_ID), usuarioConsulta);   }

    public void mailConsulta(String mailConsulta) { completeField(By.id(INPUT_MAILCONSULTA_ID), mailConsulta);   }

    public void telefonoConsulta(String telefonoConsulta) { completeField(By.id(INPUT_TELEFONO_ID), telefonoConsulta);  }

    public void clickmensajeConsultaok() { clickElement(By.id(CLICK_MENSAJECONSULTA_ID));   }

    public void mensajeConsulta(String mensajeConsulta) { completeField(By.id(INPUT_MENSAJECONSULTA_ID), mensajeConsulta);  }

    public void clickmensajeConsultaenvok() { clickElement(By.xpath(CLICK_MENSAJECONSULTA_XPATH));   }

    //SCENARIO 02

    public void envioOpinion() { clickElement(By.xpath(CLICK_OPINION_XPATH));   }

    public void puntaje() { clickElement(By.linkText(CLICK_PUNTAJE_LINKTEXT));   }

    public void barrio() { clickElement(By.xpath(CLICK_BARRIO_XPATH));   }

    public void brc() { clickElement(By.xpath(CLICK_BARRACAS_XPATH));   }

    public void motivo(String motivo) { completeField(By.id(INPUT_MOTIVO_ID), motivo);  }

    public void clickmotivook() { clickElement(By.cssSelector(CLICK_MOTIVO_CSSLOCATOR));   }

    public void clickmailopinionok() { clickElement(By.name(CLICK_MAILOKOPINION_NAME));   }

    public void mailOpinion(String mailOpinion) { completeField(By.xpath(INPUT_MAILOPINION_XPATH), mailOpinion);  }

    public void clickopinionok() { clickElement(By.xpath(CLICK_MAILOPINION_XPATH));   }

    //SCENARIO 03

    public void lowcost() { clickElement(By.xpath(CLICK_LOWCOST_XPATH));   }

    public void precio() { clickElement(By.id(CLICK_PRECIO_ID));   }

    public void butaca() { clickElement(By.xpath(CLICK_BUTACA_XPATH));   }

    public void butacaenv() { clickElement(By.xpath(CLICK_BUTACAOK_XPATH));   }

    public void envform() { clickElement(By.id(CLICK_ENVFORM_ID));   }


    //SCENARIO 04

    public void reenviarPasaje() { clickElement(By.xpath(CLICK_REENVIARPASAJE_XPATH));   }

    public void envioVacio() { clickElement(By.id(CLICK_BOTONREENVIAR_ID));   }


    //SCENARIO 05

    public void solicitarAyuda() { clickElement(By.xpath(CLICK_AYUDA_XPATH));   }

    public void palabraBuscar(String palabraBuscar) { completeField(By.id(INPUT_AYUDAFORM_ID), palabraBuscar);  }

    public void clickbuscarok() { clickElement(By.xpath(CLICK_BUSCAR_XPATH));   }

    public void linkFAQ() { clickElement(By.xpath(CLICK_LINK_XPATH));   }


    //SCENARIO 06

    public void promoInfo() { clickElement(By.xpath(CLICK_PROMOINFO_XPATH));   }

    public void promoLink() { clickElement(By.xpath(CLICK_PROMOLINK_XPATH));   }


    //SCENARIO 07

    public void devolverPasaje() { clickElement(By.xpath(CLICK_DEVOLVERPASAJE_XPATH));   }

    //SCENARIO 08

    public void enterMail(String mail) { completeField(By.id(INPUT_SEARCH_ID), mail);  }

    public void clickButton() { clickElement(By.className(CLICK_BUTTON_CLASSNAME));   }

    //SCENARIO 09

    public void clickorigen() { clickElement(By.id(CLICK_ORIGEN_ID));  }

    public void origen(String origen) { completeField(By.xpath(INPUT_ORIGEN_XPATH), origen); }

    public void clickorigenok() { clickElement(By.xpath(CLICK_ORIGENOK_XPATH));  }

    public void destino(String destino) { completeField(By.xpath(INPUT_DESTINO_XPATH), destino); }

    public void clickdestinook() { clickElement(By.xpath(CLICK_DESTINOOK_XPATH));  }

    public void calendario() { clickElement(By.id(CLICK_CALENDARIO_ID));  }

    public void okcalendario() { clickElement(By.xpath(CLICK_OKCALENDARIO_XPATH)); }

    public void buscar() { clickElement(By.name(SEARCH_BUTTON_NAME));   }

    //SCENARIO 10

    public void basesCondiciones() { clickElement(By.xpath(CLICK_BASESCONDICIONES_XPATH));   }

    }
