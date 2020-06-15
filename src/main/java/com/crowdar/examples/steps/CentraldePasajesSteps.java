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

    // Steps Scenario 01

    @When("solicita informacion a traves de solapa Dejanos tu consulta")
    public void dejanosConsulta() { Injector._page(CentraldePasajesHomePage.class).dejanosConsulta();  }

    @And("ingresa nombre de usuario (.*)")
    public void usuarioConsulta(String usuarioConsulta) {
        Injector._page(CentraldePasajesHomePage.class).usuarioConsulta(usuarioConsulta); }

    @And("ingresa mail de usuario (.*)")
    public void mailConsulta(String mailConsulta) {
        Injector._page(CentraldePasajesHomePage.class).mailConsulta(mailConsulta); }

    @And("ingresa telefono de usuario (.*)")
    public void telefonoConsulta(String telefonoConsulta) {
        Injector._page(CentraldePasajesHomePage.class).telefonoConsulta(telefonoConsulta); }

    @And("ingresa mensaje de usuario (.*)")
    public void mensajeConsulta(String mensajeConsulta) {
        Injector._page(CentraldePasajesHomePage.class).clickmensajeConsultaok();
        Injector._page(CentraldePasajesHomePage.class).mensajeConsulta(mensajeConsulta);
        Injector._page(CentraldePasajesHomePage.class).clickmensajeConsultaenvok(); }

    @Then("se visualiza el mensaje de consulta enviado satisfactoriamente")
    public void statConsultaVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getConsultaStatsok().isEmpty());  }

    // Steps Scenario 02

    @When("solicita enviar opinion en solapa Dejanos tu opinion")
    public void envioOpinion() { Injector._page(CentraldePasajesHomePage.class).envioOpinion();  }

    @And("ingresa puntaje")
    public void puntaje() { Injector._page(CentraldePasajesHomePage.class).puntaje(); }

    @And("ingresa barrio")
    public void barrio() {
        Injector._page(CentraldePasajesHomePage.class).barrio();
        Injector._page(CentraldePasajesHomePage.class).brc(); }

    @And("ingresa motivo (.*)")
        public void motivo(String motivo) {
        Injector._page(CentraldePasajesHomePage.class).motivo(motivo);
        Injector._page(CentraldePasajesHomePage.class).clickmotivook(); }

    @And("ingresa mail (.*)")
           public void mailOpinion(String mailOpinion) {
           Injector._page(CentraldePasajesHomePage.class).clickmailopinionok();
           Injector._page(CentraldePasajesHomePage.class).mailOpinion(mailOpinion);
           Injector._page(CentraldePasajesHomePage.class).clickopinionok(); }

    @Then("se visualiza el mensaje de envio satisfactorio")
    public void statOpinionVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getOpinionStatsok().isEmpty());  }

    // Steps Scenario 03

    @When("solicita reservar en la primer opcion")
    public void lowcost() { Injector._page(CentraldePasajesHomePage.class).lowcost();  }

    @And("ingresa a link de primer precio")
    public void precio() { Injector._page(CentraldePasajesHomePage.class).precio(); }

    @And("ingresa butaca 44")
    public void butaca() {
        Injector._page(CentraldePasajesHomePage.class).butaca();
        Injector._page(CentraldePasajesHomePage.class).butacaenv(); }

    @And("envia datos sin llenar fomularios con datos personales")
    public void envform() {
        Injector._page(CentraldePasajesHomePage.class).envform(); }


    @Then("se visualiza el mensaje de ingresar correctamente datos validos")
    public void statLowcostVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getLowcostStatsok().isEmpty());  }

    // Steps Scenario 04

    @When("solicita reenviar pasaje")
    public void reenviarPasaje() { Injector._page(CentraldePasajesHomePage.class).reenviarPasaje();  }

    @And("envia sin rellenar formularios ni captcha")
    public void envioVacio() { Injector._page(CentraldePasajesHomePage.class).envioVacio();  }

    @Then("se visualiza el mensaje de error completar data")
    public void statEnvioVacioVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getEnvioVacioStatsok().isEmpty());  }

    // Steps Scenario 05

    @When("solicita ayuda")
    public void solicitarAyuda() { Injector._page(CentraldePasajesHomePage.class).solicitarAyuda();  }

    @And("ingresa palabra a buscar (.*)")
    public void palabraBuscar(String palabraBuscar) {
        Injector._page(CentraldePasajesHomePage.class).palabraBuscar(palabraBuscar);
        Injector._page(CentraldePasajesHomePage.class).clickbuscarok(); }

    @And("ingresa a primer link")
    public void linkFAQ() { Injector._page(CentraldePasajesHomePage.class).linkFAQ();  }

    @Then("se visualiza el contenido del FAQ elegido")
    public void statFAQVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getFAQStatsok().isEmpty());  }

    // Steps Scenario 06

    @When("solicita informacion de promociones a traves de link")
    public void promoInfo() { Injector._page(CentraldePasajesHomePage.class).promoInfo();  }

    @And("ingresa al primer link")
    public void promoLink() { Injector._page(CentraldePasajesHomePage.class).promoLink(); }

    @Then("se visualiza la informacion de forma satisfactoria")
    public void statPromoVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getPromoStatsok().isEmpty());  }

    // Steps Scenario 07

    @And("ingresa a devolver mi pasaje")
    public void devolverPasaje() { Injector._page(CentraldePasajesHomePage.class).devolverPasaje(); }

    @Then("se visualiza el mensaje de devolucion online no disponible")
    public void statDevolucionVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getDevolucionStatsok().isEmpty());  }

    // Steps Scenario 08
    @When("solicita informacion por Newsletter al mail (.*)")
    public void newsletter(String mail) { Injector._page(CentraldePasajesHomePage.class).enterMail(mail); }

    @And("hace click en el boton Submit")
    public void clickButton() { Injector._page(CentraldePasajesHomePage.class).clickButton();  }

    @Then("se visualiza el mensaje de suscripcion al Newsletter")
    public void statNewsletterVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getNewsletterStatsok().isEmpty());  }


    // Steps Scenario Outline 09
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
    public void statReservaVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getStatsReservaok().isEmpty());  }

    // Steps Scenario 10

    @And("hace click en el linkfooter de Bases y Condiciones")
    public void basesCondiciones() { Injector._page(CentraldePasajesHomePage.class).basesCondiciones(); }

    @Then("se visualiza pagina de Bases y Condiciones")
    public void statBasesVerification() { Assert.assertTrue(!Injector._page(CentraldePasajesResultOkPage.class).getBasesStatsok().isEmpty());  }


}
