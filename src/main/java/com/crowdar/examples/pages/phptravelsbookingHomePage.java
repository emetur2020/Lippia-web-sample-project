package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.concurrent.TimeUnit;



public class phptravelsbookingHomePage extends PageBasephptravelsbooking {

    private final String CLICK_DESTINATION_ID = "s2id_autogen1";
    private final String INPUT_DESTINATION_CSSLOCATOR = "#select2-drop > div > input";
    private final String CLICK_DESTINATIONOK_XPATH = "//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div";
    private final String CLICK_CHECKIN_CSSLOCATOR = "#checkin";
    private final String CLICK_CHECKOUT_CSSLOCATOR = "#checkout";
    private final String CLICK_BUTTONSEARCH_XPATH = "//button[@type='submit']";
    private final String CLICK_SELECTHOTEL_XPATH = "//*[@id=\"LIST\"]/li[1]/div/div/div[2]/div/div[3]/div/div[2]/form/button";
    private final String CLICK_SELECTSUITE_XPATH = "//*[@id=\"detail-content-sticky-nav-02\"]/div[2]/div[2]/div/div[2]/div/div[2]/form/button";
    private final String CLICK_FIRSTNAME_CSSLOCATOR = "#first_name";
    private final String INPUT_FIRSTNAME_ID = "first_name";
    private final String CLICK_LASTNAME_ID = "last_name";
    private final String INPUT_LASTNAME_ID = "last_name";
    private final String CLICK_EMAILREGISTER_XPATH = "//div[@id='thhotels']/div/div/div[3]/form/div/div[2]/div[2]/div[2]/input";
    private final String INPUT_EMAILREGISTER_XPATH = "//div[@id='thhotels']/div/div/div[3]/form/div/div[2]/div[2]/div[2]/input";
    private final String CLICK_COUNTRY_XPATH = "//div[@id='country_code_chosen']/a/span";
    private final String INPUT_COUNTRY_XPATH = "(//input[@type='text'])[3]";
    private final String CLICK_COUNTRYOK_XPATH = "//*[@id=\"country_code_chosen\"]/div/ul/li";
    private final String CLICK_PHONE_ID = "phone_number";
    private final String INPUT_PHONE_ID = "phone_number";
    private final String CLICK_PHONEOK_XPATH = "//button[@type='submit']";
    private final String CLICK_EMAILBOOKING_NAME = "email";
    private final String INPUT_EMAILBOOKING_NAME = "email";
    private final String CLICK_EMAILBOOKING_XPATH = "//button[@type='submit']";
    private final String CLICK_COUNTRYORIGEN_XPATH = "//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/div/form/button";
    private final String CLICK_PAGARTARJETA_XPATH = "//div[@id='root']/div/div/div/div[2]/div/div/div[2]/div/button";
    private final String CLICK_CREDITCARD_NAME = "cardNumber";
    private final String INPUT_CREDITCARD_NAME = "cardNumber";
    private final String CLICK_USERCREDITCARD_NAME = "name";
    private final String INPUT_USERCREDITCARD_NAME = "name";
    private final String CLICK_EXPIRATIONMONTH_NAME = "month";
    private final String INPUT_EXPIRATIONMONTH_NAME = "month";
    private final String CLICK_EXPIRATIONYEAR_NAME = "year";
    private final String INPUT_EXPIRATIONYEAR_NAME = "year";
    private final String CLICK_SECURITYCODE_NAME = "cvv";
    private final String INPUT_SECURITYCODE_NAME = "cvv";
    private final String CLICK_BUTTONPAYNOW_XPATH = "//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/div/div/div[2]/form/button";


    public phptravelsbookingHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
          navigateToCompleteURL();
    }

    public void clickdestinationok() {
          clickElement(By.id(CLICK_DESTINATION_ID));
    }

    public void destination(String destination) {
        completeField(By.cssSelector(INPUT_DESTINATION_CSSLOCATOR),destination);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement selectResult = driver.findElement(By.xpath(CLICK_DESTINATIONOK_XPATH));
        selectResult.click();
    }

    public void CheckIn(String checkin){
        WebElement inputCheckIn = driver.findElement(By.cssSelector(CLICK_CHECKIN_CSSLOCATOR));
        inputCheckIn.clear();
        inputCheckIn.sendKeys(checkin);
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeigth)");
        inputCheckIn.sendKeys(Keys.TAB);
    }

    public void CheckOut(String checkout){
        WebElement inputCheckIn = driver.findElement(By.cssSelector(CLICK_CHECKOUT_CSSLOCATOR));
        inputCheckIn.clear();
        inputCheckIn.sendKeys(checkout);
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeigth)");
        inputCheckIn.sendKeys(Keys.TAB);
    }

    public void buscar() {
        clickElement(By.xpath(CLICK_BUTTONSEARCH_XPATH));
    }

    public void hotel() {

        clickElement(By.xpath(CLICK_SELECTHOTEL_XPATH));
    }

    public void suite() {

        clickElement(By.xpath(CLICK_SELECTSUITE_XPATH));
    }

    public void clickfirstNameok() {

        clickElement(By.cssSelector(CLICK_FIRSTNAME_CSSLOCATOR));
    }

    public void firstName(String firstName) {

        completeField(By.id(INPUT_FIRSTNAME_ID), firstName);
    }


    public void clicklastNameok() {

        clickElement(By.id(CLICK_LASTNAME_ID));
    }

    public void lastName(String lastName) {

        completeField(By.id(INPUT_LASTNAME_ID), lastName);
    }


    public void clickemailRegisterok() {

        clickElement(By.xpath(CLICK_EMAILREGISTER_XPATH));
    }

    public void emailRegister(String emailRegister) {

        completeField(By.xpath(INPUT_EMAILREGISTER_XPATH), emailRegister);
    }

    public void clickcountryok() {

        clickElement(By.xpath(CLICK_COUNTRY_XPATH));
    }

    public void country(String country) {

        completeField(By.xpath(INPUT_COUNTRY_XPATH), country);
    }

    public void clickcountryenvok() {

        clickElement(By.xpath(CLICK_COUNTRYOK_XPATH));
    }

    public void clicktelefonoPersonalok() {

        clickElement(By.id(CLICK_PHONE_ID));
    }

    public void telefonoPersonal(String telefonoPersonal) {

        completeField(By.id(INPUT_PHONE_ID), telefonoPersonal);
    }

    public void clicktelefonoPersonalenvok() {

        clickElement(By.xpath(CLICK_PHONEOK_XPATH));
    }

    public void clickemailCompraok() {

        clickElement(By.name(CLICK_EMAILBOOKING_NAME));
    }

    public void emailCompra(String emailCompra) {
        completeField(By.name(INPUT_EMAILBOOKING_NAME), emailCompra);
    }

    public void clickemailCompraenvok() {

        clickElement(By.xpath(CLICK_EMAILBOOKING_XPATH));
    }

    public void clickcountryOrigenok() {

        clickElement(By.xpath(CLICK_COUNTRYORIGEN_XPATH));
    }

    public void botonPagar() {

        clickElement(By.xpath(CLICK_PAGARTARJETA_XPATH));
    }

    public void clicknumeroTarjetaok() {

        clickElement(By.name(CLICK_CREDITCARD_NAME));
    }

    public void numeroTarjeta(String numeroTarjeta) {

        completeField(By.name(INPUT_CREDITCARD_NAME), numeroTarjeta);
    }

    public void clicknombreTarjetaok() {

        clickElement(By.name(CLICK_USERCREDITCARD_NAME));
    }

    public void nombreTarjeta(String nombreTarjeta) {
        completeField(By.name(INPUT_USERCREDITCARD_NAME), nombreTarjeta);
    }

    public void clickmesVencimientook() {
        clickElement(By.name(CLICK_EXPIRATIONMONTH_NAME));
    }

    public void mesVencimiento(String mesVencimiento) {
        completeField(By.name(INPUT_EXPIRATIONMONTH_NAME), mesVencimiento);
    }

    public void clickvencimientook() {

        clickElement(By.name(CLICK_EXPIRATIONYEAR_NAME));
    }

    public void vencimiento(String vencimiento) {

        completeField(By.name(INPUT_EXPIRATIONYEAR_NAME), vencimiento);
    }

    public void clickcodigoSeguridadok() {

        clickElement(By.name(CLICK_SECURITYCODE_NAME));
    }

    public void codigoSeguridad(String codigoSeguridad) {
        completeField(By.name(INPUT_SECURITYCODE_NAME), codigoSeguridad);
    }

    public void botonPagarAhora() {

        clickElement(By.xpath(CLICK_BUTTONPAYNOW_XPATH));
    }

}