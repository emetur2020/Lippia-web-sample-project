package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.phptravelsbookingHomePage;
import com.crowdar.examples.pages.phptravelsbookingResultOkPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class phptravelsbookingSteps extends PageSteps {

    @Given("un usuario de phptravels")
    public void home() {
        Injector._page(phptravelsbookingHomePage.class).go();
    }

    @When("ingresa Ciudad destino (.*)")
    public void destination(String destination) {
        Injector._page(phptravelsbookingHomePage.class).clickdestinationok();
        Injector._page(phptravelsbookingHomePage.class).destination(destination);
    }

    @And("ingresa fecha de checkin (.*)")
    public void CheckIn(String checkin) {
        Injector._page(phptravelsbookingHomePage.class).CheckIn(checkin);
    }

    @And("ingresa fecha de checkout (.*)")
    public void CheckOut(String checkout) {
        Injector._page(phptravelsbookingHomePage.class).CheckOut(checkout);
    }

    @And("hace click en el boton Buscar")
    public void buscar() {
        Injector._page(phptravelsbookingHomePage.class).buscar();
    }

    @And("selecciona el primer hotel de la busqueda")
    public void hotel() {
        Injector._page(phptravelsbookingHomePage.class).hotel();
    }

    @And("selecciona primera suite en el listado")
    public void suite() {
        Injector._page(phptravelsbookingHomePage.class).suite();
    }

    @And("ingresa Nombre (.*)")
    public void firstName(String firstName) {
        Injector._page(phptravelsbookingHomePage.class).clickfirstNameok();
        Injector._page(phptravelsbookingHomePage.class).firstName(firstName);

    }

    @And("ingresa Apellido (.*)")
    public void lastName(String lastName) {
        Injector._page(phptravelsbookingHomePage.class).clicklastNameok();
        Injector._page(phptravelsbookingHomePage.class).lastName(lastName);

    }

    @And("ingresa Email (.*)")
    public void emailRegister(String emailRegister) {
        Injector._page(phptravelsbookingHomePage.class).clickemailRegisterok();
        Injector._page(phptravelsbookingHomePage.class).emailRegister(emailRegister);
        // Injector._page(phptravelsbookingHomePage.class).clickemailRegisterenvok();
    }

    @And("ingresa Pais de Residencia (.*)")
    public void country(String country) {
        Injector._page(phptravelsbookingHomePage.class).clickcountryok();
        Injector._page(phptravelsbookingHomePage.class).country(country);
        Injector._page(phptravelsbookingHomePage.class).clickcountryenvok();
    }

    @And("ingresa Telefono personal (.*)")
    public void telefonoPersonal(String telefonoPersonal) {
        Injector._page(phptravelsbookingHomePage.class).clicktelefonoPersonalok();
        Injector._page(phptravelsbookingHomePage.class).telefonoPersonal(telefonoPersonal);
        Injector._page(phptravelsbookingHomePage.class).clicktelefonoPersonalenvok();
    }

    @And("ingresa info para completar transaccion (.*)")
    public void emailCompra(String emailCompra) {
        Injector._page(phptravelsbookingHomePage.class).clickemailCompraok();
        Injector._page(phptravelsbookingHomePage.class).emailCompra(emailCompra);
        Injector._page(phptravelsbookingHomePage.class).clickemailCompraenvok();
    }

    @And("ingresa Pais donde se encuentra")
    public void countryOrigen() {
        Injector._page(phptravelsbookingHomePage.class).clickcountryOrigenok();
    }

    @And("hace click en el boton Pagar con Tarjeta")
    public void botonPagar() {
        Injector._page(phptravelsbookingHomePage.class).botonPagar();
    }

    @And("ingresa Numero de tarjeta (.*)")
    public void numeroTarjeta(String numeroTarjeta) {
        Injector._page(phptravelsbookingHomePage.class).clicknumeroTarjetaok();
        Injector._page(phptravelsbookingHomePage.class).numeroTarjeta(numeroTarjeta);
    }

    @And("ingresa propietario tarjeta (.*)")
    public void nombreTarjeta(String nombreTarjeta) {
        Injector._page(phptravelsbookingHomePage.class).clicknombreTarjetaok();
        Injector._page(phptravelsbookingHomePage.class).nombreTarjeta(nombreTarjeta);
    }

    @And("ingresa Mes de vencimiento (.*)")
    public void mesVencimiento(String mesVencimiento) {
        Injector._page(phptravelsbookingHomePage.class).clickmesVencimientook();
        Injector._page(phptravelsbookingHomePage.class).mesVencimiento(mesVencimiento);
    }

    @And("ingresa Vencimiento (.*)")
    public void vencimiento(String vencimiento) {
        Injector._page(phptravelsbookingHomePage.class).clickvencimientook();
        Injector._page(phptravelsbookingHomePage.class).vencimiento(vencimiento);
    }

    @And("ingresa Codigo de Seguridad/CVV (.*)")
    public void codigoSeguridad(String codigoSeguridad) {
        Injector._page(phptravelsbookingHomePage.class).clickcodigoSeguridadok();
        Injector._page(phptravelsbookingHomePage.class).codigoSeguridad(codigoSeguridad);
    }

    @And("hace click en el boton Pagar ahora")
    public void botonPagarAhora() {
        Injector._page(phptravelsbookingHomePage.class).botonPagarAhora();
    }

    @Then("el mensaje de error informando que el pago ha sido rechazado por el Banco")
    public void Verificacion() {
        Assert.assertTrue(!Injector._page(phptravelsbookingResultOkPage.class).getStatsReservaok().isEmpty());
    }

}