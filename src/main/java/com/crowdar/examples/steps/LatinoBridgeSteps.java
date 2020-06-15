package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.LatinoBridgeHomePage;
import com.crowdar.examples.pages.LatinoBridgeResultOkPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LatinoBridgeSteps extends PageSteps {

    @Given("un usuario de latino bridge solicita cotizacion sin cargo")
    public void home() { Injector._page(LatinoBridgeHomePage.class).go();  }

    // Steps Scenario 01

    @When("ingresa nombre de usuario cotizacion (.*)")
    public void usuarioNombre(String usuarioNombre) {
        Injector._page(LatinoBridgeHomePage.class).usuarioNombre(usuarioNombre); }

    @And("ingresa mail de usuario cotizacion (.*)")
    public void mailCotizacion(String mailCotizacion) {
        Injector._page(LatinoBridgeHomePage.class).mailCotizacion(mailCotizacion); }

    @And("ingresa telefono de usuario cotizacion (.*)")
    public void telefonoCotizacion(String telefonoCotizacion) {
        Injector._page(LatinoBridgeHomePage.class).telefonoCotizacion(telefonoCotizacion); }

    @And("ingresa mensaje de usuario cotizacion (.*)")
    public void mensajeCotizacion(String mensajeCotizacion) {
        // Injector._page(LatinoBridgeHomePage.class).clickmensajeCotizacionok();
        Injector._page(LatinoBridgeHomePage.class).mensajeCotizacion(mensajeCotizacion);
        Injector._page(LatinoBridgeHomePage.class).clickmensajeCotizacionenvok(); }

    @Then("se visualiza el mensaje de pedido de cotizacion enviado satisfactoriamente")
    public void statCotizacionVerification() { Assert.assertTrue(!Injector._page(LatinoBridgeResultOkPage.class).getCotizacionStatsok().isEmpty());  }

}

