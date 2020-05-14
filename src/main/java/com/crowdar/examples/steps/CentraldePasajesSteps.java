package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.CentraldePasajesHomePage;
import com.crowdar.examples.pages.CentraldePasajesResultOkPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CentraldePasajesSteps extends PageSteps {

    @Given("un usuario de central de pasajes")
    public void home() { Injector._page(CentraldePasajesHomePage.class).go();  }

    @When("realiza una consulta de pasaje con origen (.*)")
    public void origen(String origen) {
        Injector._page(CentraldePasajesHomePage.class).clickorigen();
        Injector._page(CentraldePasajesHomePage.class).origen(origen);
        Injector._page(CentraldePasajesHomePage.class).clickorigenok();
    }

    @And("realiza una consulta de pasaje con destino (.*)")
    public void destino(String destino) {
        Injector._page(CentraldePasajesHomePage.class).destino(destino);
        Injector._page(CentraldePasajesHomePage.class).clickdestinook();
    }

    @And("realiza una consulta de pasajes con una semana de antelacion")
    public void calendario() {
        Injector._page(CentraldePasajesHomePage.class).calendario();
        Injector._page(CentraldePasajesHomePage.class).okcalendario();
    }

    @And("hace click en el boton Buscar")
    public void buscar() { Injector._page(CentraldePasajesHomePage.class).buscar();  }


    @Then("el mensaje de error informando que no hay servicios en la fecha seleccionada")
    public void statVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getStatsok().isEmpty());  }

}
